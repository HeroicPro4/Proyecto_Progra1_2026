/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import Conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tonit
 */
public class Tickets_DAO {

    private final Conexion neon = new Conexion();
    String qry;

    public boolean guardar(TicketsModel tk) {

        qry = "INSERT INTO ticket( partido_id, numero_asiento, precio, estado) VALUES(?,?,?,?)";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
        ) {
            ps.setInt(1, tk.getIdCliente());
            ps.setInt(1, tk.getIdPartido());
            ps.setString(2, tk.getAsiento());
            ps.setDouble(3, tk.getPrecio());
            ps.setString(4, tk.getEstado());

            ps.executeUpdate();

            ps.close();
            cn.close();

            return true;
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return false;
    }

    public boolean Modificar(TicketsModel tk) {

        qry = "UPDATE ticket partido_id=?, numero_asiento=?, precio=?, estado=? WHERE id=?";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
        ) {
            ps.setInt(1, tk.getIdCliente());
            ps.setInt(1, tk.getIdPartido());
            ps.setString(2, tk.getAsiento());
            ps.setDouble(3, tk.getPrecio());
            ps.setString(4, tk.getEstado());
            ps.setInt(5, tk.getId());

            ps.executeUpdate();

            cn.close();
            ps.close();

            return true;
        } catch (SQLException e) {
           e.printStackTrace();
        }
        return false;
    }

    public boolean Eliminar(int id) {

        qry = "DELETE FROM ticket WHERE id=?";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
        ) {
            ps.setInt(1, id);

            ps.executeUpdate();

            cn.close();
            ps.close();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public TicketsModel buscarId(int id) {

        TicketsModel tk = null;
        qry = "SELECT * FROM ticket WHERE id=?";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
        ) {
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                tk = new TicketsModel(
                    rs.getInt("id"),
                    rs.getInt("id_cliente"),
                    rs.getInt("id_partido"),
                    rs.getString("asiento"),
                    rs.getDouble("precio"),
                    rs.getString("estado")
                );
            }

            if (tk == null) {
                System.out.println("NO existe ticket");
            }

            cn.close();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();       
        }
        return tk;
    }

    public List<TicketsModel> obtenerTodos() {

        List<TicketsModel> lista = new ArrayList<>();
        qry = "SELECT * FROM ticket";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
            ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                TicketsModel tk = new TicketsModel(
                    rs.getInt("id"),
                    rs.getInt("id_cliente"),
                    rs.getInt("id_partido"),
                    rs.getString("asiento"),
                    rs.getDouble("precio"),
                    rs.getString("estado")
                );
                lista.add(tk);
            }

            cn.close();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}

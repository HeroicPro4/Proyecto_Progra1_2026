/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

import Conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tonit
 */
public class Ventas_DAO {

    private final Conexion neon = new Conexion();
    String qry;

    public boolean guardar(VentasModel vt) {

        qry = "INSERT INTO venta(id_cliente, fecha, total, metodo_pago) VALUES(?,?,?,?)";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
        ) {
            ps.setInt(1, vt.getIdCliente());
            ps.setDate(3, vt.fecha);
            ps.setDouble(3, vt.getTotal());
            ps.setString(4, vt.getMetodoPago());

            ps.executeUpdate();

            ps.close();
            cn.close();

            return true;
        } catch (SQLException e) {
            System.out.println(e.getStackTrace());
        }
        return false;
    }

    public boolean Modificar(VentasModel vt) {

        qry = "UPDATE venta SET id_cliente=?, fecha=?, total=?, metodo_pago=? WHERE id=?";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
        ) {
            ps.setInt(1, vt.getIdCliente());
            ps.setDate(3, vt.fecha);
            ps.setDouble(3, vt.getTotal());
            ps.setString(4, vt.getMetodoPago());
            ps.setInt(5, vt.getId());

            ps.executeUpdate();

            cn.close();
            ps.close();

            return true;
        } catch (SQLException e) {
            System.out.println(e.getStackTrace());
        }
        return false;
    }

    public boolean Eliminar(int id) {

        qry = "DELETE FROM venta WHERE id=?";

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
            System.out.println(e.getStackTrace());
        }
        return false;
    }

    public VentasModel buscarId(int id) {

        VentasModel vt = null;
        qry = "SELECT * FROM venta WHERE id=?";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
        ) {
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                vt = new VentasModel(
                    rs.getInt("id"),
                    rs.getInt("id_cliente"),
                    rs.getDate("fecha"),
                    rs.getDouble("total"),
                    rs.getString("metodo_pago")
                );
            }

            if (vt == null) {
                System.out.println("NO existe venta");
            }

            cn.close();
            ps.close();

        } catch (SQLException e) {
            System.out.println(e.getStackTrace());
        }
        return vt;
    }

    public List<VentasModel> obtenerTodos() {

        List<VentasModel> lista = new ArrayList<>();
        qry = "SELECT * FROM venta";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
            ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                VentasModel vt = new VentasModel(
                    rs.getInt("id"),
                    rs.getInt("id_cliente"),
                    rs.getDate("fecha"),
                    rs.getDouble("total"),
                    rs.getString("metodo_pago")
                );
                lista.add(vt);
            }

            cn.close();
            ps.close();

        } catch (SQLException e) {
            System.out.println(e.getStackTrace());
        }
        return lista;
    }
}

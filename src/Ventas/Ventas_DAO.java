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

        qry = "INSERT INTO venta(fecha, cliente_id, usuario_id, total) VALUES(?,?,?,?)";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
        ) {
            ps.setDate(1, vt.fecha);
            ps.setInt(2, vt.getIdCliente());
            ps.setInt(3, vt.getIdUsuario());
            ps.setDouble(4, vt.getTotal());

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

        qry = "UPDATE venta set fecha=?, cliente_id=?, usuario_id=?, total=? WHERE id=?";

        try (
            Connection cn = neon.getConnection();
            PreparedStatement ps = cn.prepareStatement(qry);
        ) {
            ps.setDate(1, vt.fecha);
            ps.setInt(2, vt.getIdCliente());
            ps.setInt(3, vt.getIdUsuario());
            ps.setDouble(4, vt.getTotal());;

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
                    rs.getDate("fecha"),
                    rs.getInt("cliente_id"),
                    rs.getInt("usuario_id"),
                    rs.getDouble("total")                 
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
            
        ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VentasModel vt = new VentasModel(
                    rs.getInt("id"),
                    rs.getDate("fecha"),
                    rs.getInt("cliente_id"),
                    rs.getInt("usuario_id"),
                    rs.getDouble("total")
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

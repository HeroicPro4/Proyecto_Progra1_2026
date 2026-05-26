/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Detalle_venta;
import Conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author tonit
 */
public class Detalle_ventaDAO {
    private final Conexion neon = new Conexion();
    String qry;
    
    public boolean Guardar (Detalle_ventaModel dv){
        int idventa = dv.idventa;
        int idtikect = dv.idtikect;
        double precio = dv.precio;
        double iva = dv.precio;
        
        qry = "INSERT INTO detalle_venta(venta_id, ticket_id, precio, iva) VALUES(?,?,?,?)";
        
        try(Connection con = neon.getConnection();
            PreparedStatement ps = con.prepareStatement(qry)){
            ps.setInt(1, idventa);
            ps.setInt(2, idtikect);
            ps.setDouble(3, precio);
            ps.setDouble(4, iva);
            
            ps.executeUpdate();
            
            con.close();
            ps.close();
            
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean Modificar(Detalle_ventaModel dv){
        int idventa = dv.idventa;
        int idtikect = dv.idtikect;
        double precio = dv.precio;
        double iva = dv.precio;
        int id = dv.id;
        
        qry = "UPDATE detalle_venta set venta_id=?, ticket_id=?, precio=?, iva=? WHERE id=?";
        
        try(Connection con = neon.getConnection();
            PreparedStatement ps = con.prepareStatement(qry)){
            ps.setInt(1, idventa);
            ps.setInt(2, idtikect);
            ps.setDouble(3, precio);
            ps.setDouble(4, iva);
            ps.setInt(6, id);
            
            ps.executeUpdate();
            con.close();
            ps.close();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    public Detalle_ventaModel buscarId(int id){
        Detalle_ventaModel dvm = null;
        qry = "SELECT * FROM detalle_venta WHERE id="+id;
        
        try(    Connection con = neon.getConnection();
                PreparedStatement ps = con.prepareStatement(qry);){
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dvm = new Detalle_ventaModel(
                rs.getInt("id"),
                rs.getInt("venta_id"),
                rs.getInt("ticket_id"),
                rs.getDouble("precio"),
                rs.getDouble("iva"));
            }
            if(dvm == null){
               JOptionPane.showMessageDialog(null, "no se encontro"); 
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return dvm;
    }
    
    public boolean Eliminar(int id){
        qry = "DELETE FROM detalle_venta WHERE id=?";
        
        try(    Connection con = neon.getConnection();
                PreparedStatement ps = con.prepareStatement(qry);){
            ps.setInt(1, id);
            ps.executeUpdate();
            con.close();
            ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean GuardarConConexion(Connection cn, Detalle_ventaModel dv) throws SQLException {
    double ivaCalculado = dv.precio * 0.12;
    String qry = "INSERT INTO detalle_venta(venta_id, ticket_id, precio, iva) VALUES(?,?,?,?)";
    try (PreparedStatement ps = cn.prepareStatement(qry)) {
        ps.setInt(1, dv.idventa);
        ps.setInt(2, dv.idtikect);
        ps.setDouble(3, dv.precio);
        ps.setDouble(4, ivaCalculado);
        return ps.executeUpdate() > 0;
    }
}
}

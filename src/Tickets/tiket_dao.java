/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author adrir
 */
public class tiket_dao {
    
    private final Conexion neon = new Conexion();
    String qry;
    
    public boolean Guardar(modelotikets tk){
    
        int idPartido = tk.getPartidoId();
        String numeroAsiento = tk.getNumero_asiento();
        String seccion = tk.getSeccion();
        double precion = tk.getPrecion();
        String estado = tk.getEstado();
        
        qry="insert into ticket(partido_id, numero_asiento, seccion, precio, estado) values(?,?,?,?,?)";
        
        try(
                Connection con = neon.getConnection();
                PreparedStatement ps = con.prepareStatement(qry);
                ){
        ps.setInt(1, idPartido);
        ps.setString(2, numeroAsiento);
        ps.setString(3, seccion);
        ps.setDouble(4, precion);
        ps.setString(5, estado);
        
        ps.executeUpdate();
        
        con.close();
        ps.close();
        
        return true;
        }catch(SQLException e){
        
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean Modificar(modelotikets tk){
    
        int idPartido = tk.getPartidoId();
        String numeroAsiento = tk.getNumero_asiento();
        String seccion = tk.getSeccion();
        double precion = tk.getPrecion();
        String estado = tk.getEstado();
        int id = tk.getId();
        
        qry="update ticket set partido_id=?, numero_asiento=?, seccion=?, precio=?, estado=? where id=?";
        
        try(Connection conn = neon.getConnection();
            PreparedStatement ps = conn.prepareStatement(qry);
            
                ){
        
            ps.setInt(1, idPartido);
            ps.setString(2, numeroAsiento);
            ps.setString(3, seccion);
            ps.setDouble(4, precion);
            ps.setString(5, estado);
            ps.setInt(6, id);
            
            ps.executeUpdate();
            
            conn.close();
            ps.close();
            
            return true;
        }catch(SQLException e){
        
            e.printStackTrace();
        }
        
        return false;
    }
    
    public modelotikets buscarId(int id){
    
        modelotikets MTK = null;
        qry="select * from ticket where id="+id;
        
        try(
                Connection con = neon.getConnection();
                PreparedStatement ps = con.prepareStatement(qry);
                
                ){
        
            
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                    MTK = new modelotikets(
                        rs.getInt("id"), 
                        rs.getInt("partido_id"), 
                        rs.getString("numero_asiento"), 
                        rs.getString("seccion"), 
                        rs.getDouble("precio"), 
                        rs.getString("estado"));
                

            }
            
                            if(MTK == null){
                
                           JOptionPane.showMessageDialog(null, "no se encontro");
                }
        }catch(SQLException e){
        
            e.printStackTrace();
        }
        return MTK;
    }
    
    public boolean Eliminar(int id){
    
        qry="delete from ticket where id=?";
        
        try(
                Connection con = neon.getConnection();
                PreparedStatement ps = con.prepareStatement(qry);
                
                ){
        
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            con.close();
            ps.close();
            
        }catch(SQLException e){
        
            e.printStackTrace();
        }
        return false;
        
    }
    
    public List <modelotikets> Listatodo(){
    
        List<modelotikets> lista = new ArrayList<>();
        
        qry="select * from ticket";
        
        try(
                Connection con = neon.getConnection();
                PreparedStatement ps = con.prepareStatement(qry);
                ResultSet rs = ps.executeQuery();
                ){
        
            while(rs.next()){
            
                modelotikets TK = new modelotikets(
                        rs.getInt("id"), 
                        rs.getInt("partido_id"), 
                        rs.getString("numero_asiento"), 
                        rs.getString("seccion"), 
                        rs.getDouble("precio"), 
                        rs.getString("estado"));
                
                lista.add(TK);
            }
            con.close();
            ps.close();
            
        }catch(SQLException e){
        e.printStackTrace();
        }
                
        return lista;        
    }
}

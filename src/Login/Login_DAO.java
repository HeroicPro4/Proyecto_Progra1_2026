/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tonit
 */
public class Login_DAO {
    public boolean Validacion(Login_Model login){
        boolean acceso = false;
        
        try{
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection();
            
            String sql = "SELECT * FROM usuario WHERE username = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getPassword());
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                acceso = true;
            }
            
            rs.close();
            ps.close();
            conn.close();
            
        } catch (Exception e){
            System.out.println("Error al validar usuario" + e.getMessage());
        }
        
        return acceso;
    }
    
    public String obtenerRol(Login_Model model){

      try{
            Conexion conexion = new Conexion();
            Connection conn = conexion.getConnection();
            
            String sql = "SELECT rol FROM usuario WHERE username = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, model.getUsuario());
            ps.setString(2, model.getPassword());
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                return  rs.getString("rol");
            }
            
            rs.close();
            ps.close();
            conn.close();
            
        } catch (Exception e){
           e.printStackTrace();
        }
        
        return null;
    }
}

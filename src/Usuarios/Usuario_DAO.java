/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Usuario_DAO {
    
    private final Conexion neon = new Conexion();
    String qry;
    
    
    public boolean guardar(UsuariosModel user){
    
        qry="insert into usuario(username, password, rol, estado) values(?,?,?,?)";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ){
        
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getContrasena());
            ps.setString(3, user.getRol());
            ps.setBoolean(4, user.isEstado());
            
            
            ps.executeUpdate();
            
            ps.close();
            cn.close();
            
            return true;
        }catch(SQLException e){
        
            System.out.println(e.getStackTrace());
        }
        return false;
    }
    
    public boolean Actualizar(UsuariosModel user){
    
        qry="update usuario set username=?, password=?, rol=?, estado=? where id=?";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ){
        
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getContrasena());
            ps.setString(3, user.getRol());
            ps.setBoolean(4, user.isEstado());
            ps.setInt(5, user.getId());
            
            ps.executeUpdate();
            
            cn.close();
            ps.close();
            
            return true;
            
        }catch(SQLException e){
        
            System.out.println(e.getStackTrace());
        }
        
        return false;
    }
    

    public boolean Eliminar(int id){
    
        qry="Delete from usuario where id=?";
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ){
        
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            cn.close();
            ps.close();
            
            return true;
        }catch(SQLException e){
        
            System.out.println(e.getStackTrace());
        }
        
        return false;
    }
    
    public UsuariosModel buscarId(int id){
    
        UsuariosModel UP=null;
        
        qry="Select * from usuario where id=?";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ){
        
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                UP = new UsuariosModel(
                
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("rol"),
                        rs.getBoolean("estado")
                        
                );
            }
            
            if(UP == null){
            
                System.out.println("NO existe cliente");
            }
            
            cn.close();
            ps.close();
            
            
        }catch(SQLException e){
        
            System.out.println(e.getStackTrace());
        }
        
        return UP;
    }
}

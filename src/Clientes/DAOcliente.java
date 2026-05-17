/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import Conexion.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAOcliente {
    
    private final Conexion neon = new Conexion();
    String qry;
    
    
    public boolean guardar(ClienteModel cli){
    
        qry="insert into cliente(nombre, apellido, telefono, email, direccion) values(?,?,?,?,?)";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ){
        
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getTelefono());
            ps.setString(4, cli.getEmail());
            ps.setString(5, cli.getDireccion());
            
            ps.executeUpdate();
            
            ps.close();
            cn.close();
            
            return true;
        }catch(SQLException e){
        
            System.out.println(e.getStackTrace());
        }
        return false;
    }
    
    public boolean Actualizar(ClienteModel cli){
    
        qry="update cliente set nombre=?, apellido=?, telefono=?, email=?, direccion=? where id=?";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ){
        
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getTelefono());
            ps.setString(4, cli.getEmail());
            ps.setString(5, cli.getDireccion());
            ps.setInt(6, cli.getId());
            
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
    
        qry="Delete from cliente where id=?";
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
    
    public ClienteModel buscarId(int id){
    
        ClienteModel cli=null;
        
        qry="Select * from cliente where id=?";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ){
        
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                cli = new ClienteModel(
                
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("telefono"),
                        rs.getString("email"),
                        rs.getString("direccion")
                );
            }
            
            if(cli == null){
            
                System.out.println("NO existe cliente");
            }
            
            cn.close();
            ps.close();
            
            
        }catch(SQLException e){
        
            System.out.println(e.getStackTrace());
        }
        
        return cli;
    }
    
    
    public List <ClienteModel> obtenerTodos(){
    
        List<ClienteModel> lista= new ArrayList<>();
        qry="Select * from cliente";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ResultSet rs = ps.executeQuery();
                ){
        
            while(rs.next()){
            

                ClienteModel cli = new ClienteModel(
                
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("telefono"),
                        rs.getString("email"),
                        rs.getString("direccion")
                );
                lista.add(cli);
            }
            
            cn.close();
            ps.close();
        }catch(SQLException e){
        
            System.out.println(e.getStackTrace());
        }
        
        return lista;
    }
}

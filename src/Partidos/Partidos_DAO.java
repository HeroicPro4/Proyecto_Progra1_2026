/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Partidos;

import Conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Partidos_DAO {
    
    private final Conexion neon = new Conexion();
    String qry;
    
    
    public boolean guardar(PartidosModel GP){
    
        
        java.sql.Date fecha = new java.sql.Date(GP.getFecha().getTime());
        
        qry="insert into partido(equipo_local, equipo_visitante, fecha, estadio, ciudad, capacidad, estado) values(?,?,?,?,?,?,?)";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ){
        
            ps.setString(1, GP.getEquipoLocal());
            ps.setString(2, GP.getEquipoVisitante());
            
            

            ps.setDate(3, fecha);
            ps.setString(4, GP.getEstadio());
            ps.setString(5, GP.getCiudad());
            ps.setInt(6, GP.getCapacidad());
            ps.setString(7, GP.getEstado());
            
            ps.executeUpdate();
            
            ps.close();
            cn.close();
            
            return true;
        }catch(SQLException e){
        
            System.out.println(e.getStackTrace());
        }
        return false;
    }
    
    public boolean Modificar(PartidosModel GP){
    
        
        
        java.sql.Date fecha = new java.sql.Date(GP.getFecha().getTime());
        
        qry="update partido set equipo_local=?, equipo_visitante=?, fecha=?, estadio=?, ciudad=?, capacidad=?, estado=? where id=?";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ){
        
            ps.setString(1, GP.getEquipoLocal());
            ps.setString(2, GP.getEquipoVisitante());
            ps.setDate(3, fecha);
            ps.setString(4, GP.getEstadio());
            ps.setString(5, GP.getCiudad());
            ps.setInt(6, GP.getCapacidad());
            ps.setString(7, GP.getEstado());
            ps.setInt(8, GP.getId());
            
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
    
        qry="Delete from partido where id=?";
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
    
    public PartidosModel buscarId(int id){
    
        PartidosModel GP=null;
        
        qry="Select * from partido where id=?";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ){
        
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                GP = new PartidosModel(
                
                        rs.getInt("id"),
                        rs.getString("equipo_local"),
                        rs.getString("equipo_visitante"),
                        rs.getDate("fecha"),
                        rs.getString("estadio"),
                        rs.getString("ciudad"),
                        rs.getInt("capacidad"),
                        rs.getString("estado")
                );
            }
            
            if(GP == null){
            
                System.out.println("NO existe cliente");
            }
            
            cn.close();
            ps.close();
            
            
        }catch(SQLException e){
        
            e.printStackTrace();
        }
        
        return GP;
    }
    
    
    public List <PartidosModel> obtenerTodos(){
    
        List<PartidosModel> lista= new ArrayList<>();
        qry="Select * from partido";
        
        try(
                Connection cn = neon.getConnection();
                PreparedStatement ps = cn.prepareStatement(qry);
                ResultSet rs = ps.executeQuery();
                ){
        
            while(rs.next()){
            

                PartidosModel GT = new PartidosModel(
                
                        rs.getInt("id"),
                        rs.getString("equipo_local"),
                        rs.getString("equipo_visitante"),
                        rs.getDate("fecha"),
                        rs.getString("estadio"),
                        rs.getString("ciudad"),
                        rs.getInt("capacidad"),
                        rs.getString("estado")
                );
                lista.add(GT);
            }
            
            cn.close();
            ps.close();
        }catch(SQLException e){
        
            System.out.println(e.getStackTrace());
        }
        
        return lista;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import javax.swing.JOptionPane;


public class Usuario_Controler {
    private final Usuario_DAO userDAO = new Usuario_DAO();
    
    public boolean Insertar(String usuario, String contrasena, String rol, boolean estado){
        
        if(!usuario.isBlank() && !contrasena.isBlank()){
        UsuariosModel user = new UsuariosModel(usuario, contrasena, rol, estado);
        
        return userDAO.guardar(user);
    
        }else{
        
            JOptionPane.showMessageDialog(null, "Ingrese Datos faltantes");
            return false;
        }
    }
    
        public boolean Modificar(int id, String usuario, String contrasena, String rol, boolean estado){
        
            if(!usuario.isBlank() && !contrasena.isBlank()){
        UsuariosModel user = new UsuariosModel(id,usuario, contrasena, rol, estado);
        
        return userDAO.Actualizar(user);
    
            }else{
            JOptionPane.showMessageDialog(null, "Ingrese Datos faltantes");
            return false;
            }
    }
        
        public boolean Eliminar(int id){
        
            return userDAO.Eliminar(id);
        }
        
        public UsuariosModel buscarID(int id){
        
            return userDAO.buscarId(id);
        }
    
    }


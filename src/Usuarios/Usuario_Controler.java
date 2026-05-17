/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;


public class Usuario_Controler {
    private final Usuario_DAO userDAO = new Usuario_DAO();
    
    public boolean Insertar(String usuario, String contrasena, String rol, boolean estado){
        
        UsuariosModel user = new UsuariosModel(usuario, contrasena, rol, estado);
        
        return userDAO.guardar(user);
    
    }
    
        public boolean Modificar(int id, String usuario, String contrasena, String rol, boolean estado){
        
        UsuariosModel user = new UsuariosModel(id,usuario, contrasena, rol, estado);
        
        return userDAO.Actualizar(user);
    
    }
        
        public boolean Eliminar(int id){
        
            return userDAO.Eliminar(id);
        }
        
        public UsuariosModel buscarID(int id){
        
            return userDAO.buscarId(id);
        }
}

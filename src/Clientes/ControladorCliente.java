/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;


import java.util.List;
import javax.swing.JOptionPane;

public class ControladorCliente {
    
    private final DAOcliente cliDAO = new DAOcliente();
    
  public boolean GuardarCliente(String nombre, String apellido, String telefono, String email, String direccion){
        
 
        if(!nombre.isBlank() && !apellido.isBlank()){
            
        ClienteModel cli = new ClienteModel(0, nombre, apellido, telefono, email, direccion);
        
        return cliDAO.guardar(cli);
    
    }else{
          
            JOptionPane.showInternalMessageDialog(null, "ingrese datos");
            return false;
            }

    }

        public boolean ActualizarCliente(int id, String nombre, String apellido, String telefono, String email, String direccion){
        
            
            if(!nombre.isBlank() && !apellido.isBlank()){
                
        ClienteModel cli = new ClienteModel(id, nombre, apellido, telefono, email, direccion);
        return cliDAO.Actualizar(cli);
        
            }else{
            
            JOptionPane.showInternalMessageDialog(null, "ingrese datos");
            return false;
            }
    
    }
        
        public boolean EliminarCliente(int id){
        
            return cliDAO.Eliminar(id);
        }
        
        public ClienteModel ConsultarCliente(int id){
        
            return cliDAO.buscarId(id);
        }
        
        public List<ClienteModel> LIstaTodos(){
        
            return cliDAO.obtenerTodos();
        }
}

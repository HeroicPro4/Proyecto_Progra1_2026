/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Partidos;

import java.time.LocalDateTime;

import java.util.List;
import javax.swing.JOptionPane;

public class Partidos_Controler {
    
    private final Partidos_DAO DAOGP = new Partidos_DAO();
    
        public boolean GuardarPartido(String EquipoLocal, String EquipoVisitante, java.sql.Date Fecha, String Estadio, String Ciudad, int Capacidad, String Estado){
        
        if(!EquipoLocal.isBlank() && !EquipoVisitante.isBlank() && Fecha !=null && !Estadio.isBlank() && Ciudad.isBlank() && Capacidad >0){
        PartidosModel GP = new PartidosModel(0, EquipoLocal, EquipoVisitante, Fecha, Estadio, Ciudad, Capacidad, Estado);
        
        return DAOGP.guardar(GP);
    
        }else{
        
            JOptionPane.showInternalMessageDialog(null, "ingrese datos");
            return false;
        }
    }

    public boolean ModificarPartido(int id,String EquipoLocal, String EquipoVisitante, java.sql.Date Fecha, String Estadio, String Ciudad, int Capacidad, String Estado){
        
        
        if(!EquipoLocal.isBlank() && !EquipoVisitante.isBlank() && Fecha !=null && !Estadio.isBlank() && Ciudad.isBlank() && Capacidad >0){
        PartidosModel GP = new PartidosModel(id, EquipoLocal, EquipoVisitante, Fecha, Estadio, Ciudad, Capacidad, Estado);
        
        return DAOGP.Modificar(GP);
    
        }else{
        
            JOptionPane.showInternalMessageDialog(null, "ingrese datos");
            return false;
        }
    }
        
        public boolean EliminarPartido(int id){
        
            return DAOGP.Eliminar(id);
        }
        
        public PartidosModel ConsultarPartido(int id){
        
            return DAOGP.buscarId(id);
        }
        
        public List<PartidosModel> LIstaTodos(){
        
            return DAOGP.obtenerTodos();
        }
}

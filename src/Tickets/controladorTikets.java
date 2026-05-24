/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author adrir
 */
public class controladorTikets {
    
    private final tiket_dao daous = new tiket_dao();
    
    public boolean guardar(int partidoId, String numero_asiento, String seccion, double precion, String estado){
    
        modelotikets MT = new modelotikets(partidoId, numero_asiento, seccion, precion, estado);
        
       return daous.Guardar(MT);
    }
    
    public boolean Modificar(int id, int partidoId, String numero_asiento, String seccion, double precion, String estado){
    
        modelotikets MT = new modelotikets(id, partidoId, numero_asiento, seccion, precion, estado);
        
        return daous.Modificar(MT);
    }
    
    public boolean Eliminar(int id){
    
        return daous.Eliminar(id);
    }

    public modelotikets ConsultarTicket(int id){
    
        return daous.buscarId(id);
    }
    
    public List <modelotikets> Listatodos(){
    
        return daous.Listatodo();
    }
}

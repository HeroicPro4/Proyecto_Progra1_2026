/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Detalle_venta;

/**
 *
 * @author tonit
 */
public class Detalle_ventaController {
    
    private final Detalle_ventaDAO dvDAO = new Detalle_ventaDAO();
    
    public boolean Guardar(int idventa, int idtikect, double precio, double iva){
        Detalle_ventaModel cli = new Detalle_ventaModel(idventa, idtikect, precio, iva);
        return dvDAO.Guardar(cli);
    }
    
    public boolean Actualizar (int id, int idventa, int idtikect, double precio, double iva){
        Detalle_ventaModel cli = new Detalle_ventaModel(id, idventa, idtikect, precio, iva);
        return dvDAO.Modificar(cli);
    }
    
    public boolean Eliminar(int id){
        return dvDAO.Eliminar(id);
    }
    
    public Detalle_ventaModel Consultar(int id){
        return dvDAO.buscarId(id);
    }

    void Guardar(int idventa, int idticket, double precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

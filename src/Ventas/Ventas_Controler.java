/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

import Detalle_venta.Detalle_ventaDAO;
import Detalle_venta.Detalle_ventaModel;
import Tickets.modelotikets;
import Tickets.tiket_dao;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;


/**
 *
 * @author tonit
 */
public class Ventas_Controler {

    private final Ventas_DAO vtDAO = new Ventas_DAO();

    public int GuardarVenta(java.sql.Date fecha, int idCliente, int idUsuario, double total) throws SQLException {
        VentasModel vt = new VentasModel(fecha, idCliente, idUsuario, total);
        return vtDAO.guardar(vt);
    }

    public boolean ModificarVenta(int id,java.sql.Date fecha, int idCliente, int idUsuario, double total) {
        VentasModel vt = new VentasModel(id, fecha, idCliente, idUsuario, total);
        return vtDAO.Modificar(vt);
    }

    public boolean EliminarVenta(int id) {
        return vtDAO.Eliminar(id);
    }

    public VentasModel ConsultarVenta(int id) {
        return vtDAO.buscarId(id);
    }

    public List<VentasModel> LIstaTodos() {
        return vtDAO.obtenerTodos();
    }
    
   public int procesarVenta(java.sql.Date fecha, int idCliente, int idUsuario, 
                         List<Integer> ticketsIds, double subtotal) throws Exception {
    double iva = subtotal * 0.12;
    double total = subtotal + iva;
    
    tiket_dao ticketDao = new tiket_dao();
    // Validar disponibilidad y capacidad
    for (int ticketId : ticketsIds) {
        modelotikets t = ticketDao.buscarId(ticketId);
        if (t == null || !"DISPONIBLE".equals(t.getEstado())) {
            throw new Exception("El ticket " + ticketId + " no está disponible.");
        }
        if (!ticketDao.hayCapacidadDisponible(t.getPartidoId(), 1)) {
            throw new Exception("No hay cupo para el partido del ticket " + ticketId);
        }
    }
    
    // Guardar venta y obtener ID
    VentasModel venta = new VentasModel(fecha, idCliente, idUsuario, total);
    int idVenta = vtDAO.guardar(venta);
    if (idVenta == -1) throw new Exception("Error al guardar la venta");
    
    // Guardar detalles y actualizar tickets
    Detalle_ventaDAO detalleDao = new Detalle_ventaDAO();
    for (int ticketId : ticketsIds) {
        modelotikets t = ticketDao.buscarId(ticketId);
        Detalle_ventaModel detalle = new Detalle_ventaModel(0, idVenta, ticketId, t.getPrecion(), t.getPrecion() * 0.12);
        if (!detalleDao.Guardar(detalle)) {
            throw new Exception("Error al guardar detalle del ticket " + ticketId);
        }
        if (!ticketDao.actualizarEstado(ticketId, "VENDIDO")) {
            throw new Exception("Error al actualizar estado del ticket " + ticketId);
        }
    }
    return idVenta;
}
}

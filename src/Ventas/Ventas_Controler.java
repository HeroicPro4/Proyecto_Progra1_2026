/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author tonit
 */
public class Ventas_Controler {

    private final Ventas_DAO vtDAO = new Ventas_DAO();

    public boolean GuardarVenta(java.sql.Date fecha, int idCliente, int idUsuario, double total) {
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
}

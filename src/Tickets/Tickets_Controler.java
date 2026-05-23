/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

import java.util.List;

/**
 *
 * @author tonit
 */
public class Tickets_Controler {

    private final Tickets_DAO tkDAO = new Tickets_DAO();

    public boolean GuardarTicket(int idPartido, String asiento, double precio, String estado) {
        TicketsModel tk = new TicketsModel( idPartido, asiento, precio, estado);
        return tkDAO.guardar(tk);
    }

    public boolean ModificarTicket(int id , int idPartido, String asiento, double precio, String estado) {
        TicketsModel tk = new TicketsModel(id, idPartido, asiento, precio, estado);
        return tkDAO.Modificar(tk);
    }

    public boolean EliminarTicket(int id) {
        return tkDAO.Eliminar(id);
    }

    public TicketsModel ConsultarTicket(int id) {
        return tkDAO.buscarId(id);
    }

    public List<TicketsModel> LIstaTodos() {
        return tkDAO.obtenerTodos();
    }
}

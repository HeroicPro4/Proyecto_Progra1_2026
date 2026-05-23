/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

/**
 *
 * @author tonit
 */
public class TicketsModel {

    private int id;
    //private int idCliente;
    private int idPartido;
    private String asiento;
    private double precio;
    private String estado;

    public TicketsModel(int idPartido1, String asiento1, double precio1, String estado1) {
        this(0, 0, 0, "", 0.0, "");
    }

    public TicketsModel(int id, int idCliente, int idPartido, String asiento, double precio, String estado) {
        this.id = id;
        //this.idCliente = idCliente;
        this.idPartido = idPartido;
        this.asiento = asiento;
        this.precio = precio;
        this.estado = estado;
    }

    public TicketsModel(int idCliente, int idPartido, String asiento, double precio, String estado) {
        //this.idCliente = idCliente;
        this.idPartido = idPartido;
        this.asiento = asiento;
        this.precio = precio;
        this.estado = estado;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    //public int getIdCliente() { return idCliente; }
    //public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public int getIdPartido() { return idPartido; }
    public void setIdPartido(int idPartido) { this.idPartido = idPartido; }

    public String getAsiento() { return asiento; }
    public void setAsiento(String asiento) { this.asiento = asiento; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

import java.sql.Date;
import java.time.LocalDateTime;

/**
 *
 * @author tonit
 */
public class VentasModel {

    private int id;
    private int idCliente;
    java.sql.Date fecha;
    private double total;
    private String metodoPago;

    public VentasModel() {
        this(0, 0, null, 0.0, "");
    }

    public VentasModel(int id, int idCliente, java.sql.Date fecha, double total, String metodoPago) {
        this.id = id;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.total = total;
        this.metodoPago = metodoPago;
    }

    public VentasModel(int idCliente, java.sql.Date fecha, double total, String metodoPago) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.total = total;
        this.metodoPago = metodoPago;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

}

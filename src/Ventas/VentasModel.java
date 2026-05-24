/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventas;

import java.sql.Date;

/**
 *
 * @author tonit
 */
public class VentasModel {

    private int id;
    java.sql.Date fecha;
    private int idCliente;
    private int idUsuario;
    private double total;

    public VentasModel(int id, Date fecha, int idCliente, int idUsuario, double total) {
        this.id = id;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.total = total;
    }

    public VentasModel(Date fecha, int idCliente, int idUsuario, double total) {
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.total = total;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    


  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Detalle_venta;

/**
 *
 * @author adrir
 */
public class Detalle_venta {
    
    int id;
    int Idpartido;
    int idTikect;
    double precio;
    double iva;

    public Detalle_venta() {
        this(0,0,0,0,0);
    }

    public Detalle_venta(int Idpartido, int idTikect, double precio, double iva) {
        this.Idpartido = Idpartido;
        this.idTikect = idTikect;
        this.precio = precio;
        this.iva = iva;
    }

    public Detalle_venta(int id, int Idpartido, int idTikect, double precio, double iva) {
        this.id = id;
        this.Idpartido = Idpartido;
        this.idTikect = idTikect;
        this.precio = precio;
        this.iva = iva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdpartido() {
        return Idpartido;
    }

    public void setIdpartido(int Idpartido) {
        this.Idpartido = Idpartido;
    }

    public int getIdTikect() {
        return idTikect;
    }

    public void setIdTikect(int idTikect) {
        this.idTikect = idTikect;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
    
}

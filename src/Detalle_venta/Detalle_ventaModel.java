/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Detalle_venta;

/**
 *
 * @author adrir
 */
public class Detalle_ventaModel {
    
    int id;
    int idventa;
    int idtikect;
    double precio;
    double iva;

    public Detalle_ventaModel() {
        this(0,0,0,0,0);
    }

    public Detalle_ventaModel(int idventa, int idtikect, double precio, double iva) {
        this.idventa = idventa;
        this.idtikect = idtikect;
        this.precio = precio;
        this.iva = iva;
    }

    public Detalle_ventaModel(int id, int idventa, int idtikect, double precio, double iva) {
        this.id = id;
        this.idventa = idventa;
        this.idtikect = idtikect;
        this.precio = precio;
        this.iva = iva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getidventa() {
        return idventa;
    }

    public void setidventa(int idventa) {
        this.idventa = idventa;
    }

    public int getIdtikect() {
        return idtikect;
    }

    public void setIdtikect(int idtikect) {
        this.idtikect = idtikect;
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

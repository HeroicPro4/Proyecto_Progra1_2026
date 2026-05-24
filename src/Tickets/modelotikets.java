/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tickets;

/**
 *
 * @author adrir
 */
public class modelotikets {
    
    
    int id;
    int partidoId;
    String numero_asiento;
    String seccion;
    double precion;
    String estado;

    public modelotikets() {
        
        this(0,0,"","",0,"");
    }

    public modelotikets(int partidoId, String numero_asiento, String seccion, double precion, String estado) {
        this.partidoId = partidoId;
        this.numero_asiento = numero_asiento;
        this.seccion = seccion;
        this.precion = precion;
        this.estado = estado;
    }

    public modelotikets(int id, int partidoId, String numero_asiento, String seccion, double precion, String estado) {
        this.id = id;
        this.partidoId = partidoId;
        this.numero_asiento = numero_asiento;
        this.seccion = seccion;
        this.precion = precion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPartidoId() {
        return partidoId;
    }

    public void setPartidoId(int partidoId) {
        this.partidoId = partidoId;
    }

    public String getNumero_asiento() {
        return numero_asiento;
    }

    public void setNumero_asiento(String numero_asiento) {
        this.numero_asiento = numero_asiento;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public double getPrecion() {
        return precion;
    }

    public void setPrecion(double precion) {
        this.precion = precion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}

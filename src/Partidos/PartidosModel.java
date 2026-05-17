/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Partidos;

import java.time.LocalDateTime;


public class PartidosModel {
    
    int id;
    String EquipoLocal;
    String EquipoVisitante;
    LocalDateTime Fecha;
    
    String Estadio;
    String Ciudad;
    int Capacidad;
    String Estado;

    public PartidosModel() {
        
        this(0,"", "", null, "", "", 0, "");
    }

    public PartidosModel(int id, String EquipoLocal, String EquipoVisitante, LocalDateTime Fecha, String Estadio, String Ciudad, int Capacidad, String Estado) {
        this.id = id;
        this.EquipoLocal = EquipoLocal;
        this.EquipoVisitante = EquipoVisitante;
        this.Fecha = Fecha;
        this.Estadio = Estadio;
        this.Ciudad = Ciudad;
        this.Capacidad = Capacidad;
        this.Estado = Estado;
    }

    public PartidosModel(String EquipoLocal, String EquipoVisitante, LocalDateTime Fecha, String Estadio, String Ciudad, int Capacidad, String Estado) {
        this.EquipoLocal = EquipoLocal;
        this.EquipoVisitante = EquipoVisitante;
        this.Fecha = Fecha;
        this.Estadio = Estadio;
        this.Ciudad = Ciudad;
        this.Capacidad = Capacidad;
        this.Estado = Estado;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getEquipoLocal() {
        return EquipoLocal;
    }

    public void setEquipoLocal(String EquipoLocal) {
        this.EquipoLocal = EquipoLocal;
    }

    public String getEquipoVisitante() {
        return EquipoVisitante;
    }

    public void setEquipoVisitante(String EquipoVisitante) {
        this.EquipoVisitante = EquipoVisitante;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime Fecha) {
        this.Fecha = Fecha;
    }




    public String getEstadio() {
        return Estadio;
    }

    public void setEstadio(String Estadio) {
        this.Estadio = Estadio;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}

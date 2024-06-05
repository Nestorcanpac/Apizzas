package com.example.Apizzas.Model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_direccion;

    @Column(nullable = true)
    private String localidad;
    private String calle;

    private int numportal;

    private String piso;

    public Direccion() {
    }

    public Direccion(int id_direccion, String localidad, String calle, int numportal, String piso) {
        this.id_direccion = id_direccion;
        this.localidad = localidad;
        this.calle = calle;
        this.numportal = numportal;
        this.piso = piso;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumportal() {
        return numportal;
    }

    public void setNumportal(int numportal) {
        this.numportal = numportal;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }
}

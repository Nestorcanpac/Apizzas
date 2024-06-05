package com.example.Apizzas.Model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_empleado;

    @Column(nullable = true)
    private String nombre;
    private String contrasena;

    public Empleado() {
    }

    public Empleado(int id_empleado, String nombre, String contrasena) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

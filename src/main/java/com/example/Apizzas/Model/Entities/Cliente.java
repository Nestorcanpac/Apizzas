package com.example.Apizzas.Model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_cliente;

    @Column(nullable = false)
    private int telefono;
    private int id_dirección;

    public Cliente() {
    }

    public Cliente(int id_cliente, int telefono, int id_dirección) {
        this.id_cliente = id_cliente;
        this.telefono = telefono;
        this.id_dirección = id_dirección;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId_dirección() {
        return id_dirección;
    }

    public void setId_dirección(int id_dirección) {
        this.id_dirección = id_dirección;
    }
}

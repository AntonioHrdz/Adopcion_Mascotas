package org.udb.entity;

import jakarta.persistence.*;

@Entity
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String nombre;
    public String tipo;
    public int edad;
    public String descripcion;
    public String estado;
}

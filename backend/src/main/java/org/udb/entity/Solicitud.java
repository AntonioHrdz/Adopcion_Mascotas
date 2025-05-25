package org.udb.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    public Mascota mascota;

    @ManyToOne
    public Persona persona;

    public LocalDate fecha_solicitud;
    public String estado;
}

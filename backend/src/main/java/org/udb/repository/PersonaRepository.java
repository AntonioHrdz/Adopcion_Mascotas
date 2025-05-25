package org.udb.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.udb.entity.Persona;

@ApplicationScoped
public class PersonaRepository implements PanacheRepository<Persona> {
}

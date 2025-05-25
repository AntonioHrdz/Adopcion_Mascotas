package org.udb.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.udb.entity.Solicitud;

@ApplicationScoped
public class SolicitudRepository implements PanacheRepository<Solicitud> {
}

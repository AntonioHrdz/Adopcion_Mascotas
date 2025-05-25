package org.udb.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.udb.entity.Mascota;

@ApplicationScoped
public class MascotaRepository implements PanacheRepository<Mascota> {
}

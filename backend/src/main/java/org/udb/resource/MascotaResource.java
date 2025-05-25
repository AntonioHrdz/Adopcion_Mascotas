package org.udb.resource;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.udb.entity.Mascota;
import org.udb.repository.MascotaRepository;

import java.util.List;

@Path("/mascotas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MascotaResource {

    @Inject
    MascotaRepository mascotaRepo;

    @GET
    public List<Mascota> getAll() {
        return mascotaRepo.listAll();
    }

    @POST
    @Transactional
    public Mascota create(Mascota mascota) {
        mascotaRepo.persist(mascota);
        return mascota;
    }

    @PUT
    @Path("/{id}/estado")
    @Transactional
    public Mascota updateEstado(@PathParam("id") Long id, String nuevoEstado) {
        Mascota mascota = mascotaRepo.findById(id);
        if (mascota == null) {
            throw new NotFoundException();
        }
        mascota.estado = nuevoEstado;
        return mascota;
    }
}

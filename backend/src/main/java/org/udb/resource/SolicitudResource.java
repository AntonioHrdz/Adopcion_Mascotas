package org.udb.resource;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.udb.entity.Solicitud;
import org.udb.repository.SolicitudRepository;
import org.udb.repository.MascotaRepository;
import org.udb.repository.PersonaRepository;

import java.time.LocalDate;
import java.util.List;

@Path("/solicitudes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SolicitudResource {

    @Inject
    SolicitudRepository solicitudRepo;
    @Inject
    MascotaRepository mascotaRepo;
    @Inject
    PersonaRepository personaRepo;

    @GET
    public List<Solicitud> getAll() {
        return solicitudRepo.listAll();
    }

    @POST
    @Transactional
    public Solicitud create(@QueryParam("idMascota") Long idMascota,
                            @QueryParam("idPersona") Long idPersona) {
        Solicitud solicitud = new Solicitud();
        solicitud.mascota = mascotaRepo.findById(idMascota);
        solicitud.persona = personaRepo.findById(idPersona);
        solicitud.fecha_solicitud = LocalDate.now();
        solicitud.estado = "pendiente";
        solicitudRepo.persist(solicitud);
        return solicitud;
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Solicitud updateEstado(@PathParam("id") Long id, String nuevoEstado) {
        Solicitud solicitud = solicitudRepo.findById(id);
        if (solicitud == null) throw new NotFoundException();
        solicitud.estado = nuevoEstado;
        return solicitud;
    }
}

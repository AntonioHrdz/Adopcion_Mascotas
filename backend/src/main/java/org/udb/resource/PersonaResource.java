package org.udb.resource;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.udb.entity.Persona;
import org.udb.repository.PersonaRepository;

@Path("/personas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonaResource {

    @Inject
    PersonaRepository personaRepo;

    @POST
    @Transactional
    public Persona create(Persona persona) {
        personaRepo.persist(persona);
        return persona;
    }
}

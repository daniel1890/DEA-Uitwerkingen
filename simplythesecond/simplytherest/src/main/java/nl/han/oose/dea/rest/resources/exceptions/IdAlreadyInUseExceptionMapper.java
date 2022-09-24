package nl.han.oose.dea.rest.resources.exceptions;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import nl.han.oose.dea.rest.services.exceptions.IdAlreadyInUseException;

@Provider
public class IdAlreadyInUseExceptionMapper implements ExceptionMapper<IdAlreadyInUseException> {
    @Override
    public Response toResponse(IdAlreadyInUseException e) {
        return Response.status(409).entity(e.getMessage()).type("text/plain").build();
    }
}

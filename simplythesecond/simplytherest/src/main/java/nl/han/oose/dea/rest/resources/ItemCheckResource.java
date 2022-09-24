package nl.han.oose.dea.rest.resources;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import nl.han.oose.dea.rest.services.ItemService;
import nl.han.oose.dea.rest.services.dto.ItemDTO;

import java.net.URI;
import java.util.List;

@ApplicationScoped
@Path("/items")
public class ItemCheckResource {
    ItemService IS;

    public ItemCheckResource() {
        this.IS = new ItemService();
    }

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
    public Response items() {
        return Response.ok(IS.getAll()).build();
    }

    @Path("/{id}")
    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public Response getItem(@PathParam("id") int id) {
        return Response.ok(IS.getItem(id)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addItem(ItemDTO item) {
        IS.addItem(item);
        return Response.created(URI.create("/items/" +item.getId())).entity(item).build();
    }

    @Path("/delete-item/{id}")
    @DELETE
    public Response deleteItem(@PathParam("id") int id) {
        IS.deleteItem(id);
        return Response.noContent().build();
    }
}

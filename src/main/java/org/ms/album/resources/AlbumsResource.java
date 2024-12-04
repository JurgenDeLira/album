package org.ms.album.resources;


import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.ms.album.entity.Album;

@Path("/albums")
public class AlbumsResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Album> getAlbum() {
        return Uni.createFrom().item(new Album("1", "My Album", "The Artist", 1900L, "Rock"));
    }
}

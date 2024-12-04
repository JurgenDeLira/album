package org.ms.album.service;

import io.smallrye.mutiny.Uni;
import org.ms.album.entity.Album;

public class AlbumsService {

    public Uni<Album> fetchAlbum(String id) {
        // Simular lógica para obtener datos desde una base de datos
        return Uni.createFrom().item(new Album(id, "Mock Album", "Mock Artist", 1900L, "Mock Genre"));
    }
}

package org.ms.album.resources;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class AlbumsResourceTest {

    @Test
    public void testGetAlbum() {
        RestAssured.get("/albums")
                .then()
                .statusCode(200)
                .body("id", "1")
                .body("title", "My Album")
                .body("artist", "The Artist")
                .body("genre", "Rock");
    }
}

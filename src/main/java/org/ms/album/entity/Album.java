package org.ms.album.entity;

import jakarta.validation.constraints.NotBlank;

public record Album (
    @NotBlank String id,
    @NotBlank String title,
    String artist,
    Long year,
    String genre
) {}

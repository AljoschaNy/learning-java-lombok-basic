package org.example;

import lombok.With;

public record Teacher(
        String id,
        String name,
        @With
        String subject
) {
}

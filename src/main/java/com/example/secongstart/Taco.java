package com.example.secongstart;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@Data
public class Taco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;

    private LocalDateTime createdAt = LocalDateTime.now(ZoneId.of("Europe/Minsk"));

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 letters long")
    private String name;

    @NotNull
    @Size(min = 1, message = "Add at least 1 ingredient")
    private List<IngredientRef> ingredients;
}

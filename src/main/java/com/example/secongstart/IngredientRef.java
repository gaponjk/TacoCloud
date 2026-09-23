package com.example.secongstart;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class IngredientRef implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String ingredient;
}

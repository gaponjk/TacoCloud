package com.example.secongstart;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.ArrayList;

@Data
public class Taco {

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 digits long")
    private String name;

    @NotNull
    @Size(min = 1, message = "Add at least 1 ingredient")
    private ArrayList<Ingredient> ingredients;
}

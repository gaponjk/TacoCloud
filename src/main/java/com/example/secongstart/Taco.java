package com.example.secongstart;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class Taco {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private LocalDateTime createdAt = LocalDateTime.now(ZoneId.of("Europe/Minsk"));

  @NotNull
  @Size(min = 5, message = "Name must be at least 5 letters long")
  private String name;

  @NotNull
  @Size(min = 1, message = "Add at least 1 ingredient")
  @ManyToMany
  private List<Ingredient> ingredients;
}

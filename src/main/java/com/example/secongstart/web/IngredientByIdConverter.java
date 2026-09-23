package com.example.secongstart.web;

import com.example.secongstart.Ingredient;
import com.example.secongstart.data.IngredientRepository;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@EqualsAndHashCode
public class IngredientByIdConverter implements Converter<String, Ingredient> {

  private final IngredientRepository ingredientRepo;

  @Autowired
  public IngredientByIdConverter(IngredientRepository ingredientRepo) {
    this.ingredientRepo = ingredientRepo;
  }

  @Override
  public Ingredient convert(@NonNull String id) {
    return ingredientRepo.findById(id).orElse(null);
  }
}

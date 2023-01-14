package com.example.recipebook1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Recipe {

    private final long id;
    private final String nameRecipe;
    private final int cookingTimeMinutes;
    private Ingredient[] ingredients;
    private String[] cookingSteps;

}

package com.example.recipebook1.service;

import com.example.recipebook1.model.Ingredient;

public interface IngredientsService {

     Ingredient addIngredient(Ingredient ingredient);

     Ingredient getIngredientId(long id);

     Ingredient updateIngredient(long id, Ingredient ingredient);

     Ingredient remoweIngredient(long id);
}

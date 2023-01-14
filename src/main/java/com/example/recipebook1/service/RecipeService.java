package com.example.recipebook1.service;

import com.example.recipebook1.model.Recipe;

public interface RecipeService {

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipeId(long id);

    Recipe updateRecipe(long id, Recipe recipe);

    Recipe remoweRecipe(long id);
}

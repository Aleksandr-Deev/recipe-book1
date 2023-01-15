package com.example.recipebook1.controller;

import com.example.recipebook1.model.Ingredient;
import com.example.recipebook1.service.impl.IngredientsServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {

    private final IngredientsServiceImpl ingredientsService;


    public IngredientController(IngredientsServiceImpl ingredientsService) {
        this.ingredientsService = ingredientsService;
    }


    @GetMapping("/{id}")
    public Ingredient getIngredient(@PathVariable long id) {
        return this.ingredientsService.getIngredientId(id);
    }

    @PostMapping
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return this.ingredientsService.addIngredient(ingredient);
    }

    @PutMapping("/{id}")
    public Ingredient updateIngredient(@PathVariable ("id") long id, @RequestBody Ingredient ingredient) {
        return ingredientsService.updateIngredient(id, ingredient);
    }

    @DeleteMapping("/{id}")
    public Ingredient remoweIngredient(@PathVariable ("id") long id) {
        return ingredientsService.remoweIngredient(id);
    }
}

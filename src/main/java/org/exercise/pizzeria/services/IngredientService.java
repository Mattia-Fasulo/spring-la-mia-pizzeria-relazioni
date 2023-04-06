package org.exercise.pizzeria.services;

import org.exercise.pizzeria.model.Ingredient;
import org.exercise.pizzeria.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {
    @Autowired
    private IngredientRepository ingredientRepository;

    public List<Ingredient> getAll(){
        return ingredientRepository.findAll(Sort.by("name"));
    }
}

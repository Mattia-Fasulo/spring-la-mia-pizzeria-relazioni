package org.exercise.pizzeria.exceptions;

public class IngredientNotFoundException extends RuntimeException{
    public IngredientNotFoundException(String message){
        super(message);
    }
}

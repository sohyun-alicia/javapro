package taco.tacocloud.data;

import taco.tacocloud.Ingredient;

public interface IngredientRepository {
    
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}

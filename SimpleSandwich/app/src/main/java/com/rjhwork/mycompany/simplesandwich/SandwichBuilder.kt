package com.rjhwork.mycompany.simplesandwich

import com.rjhwork.mycompany.simplesandwich.ingredient.Ingredient

class SandwichBuilder {

    fun build(sandwich: Sandwich, ingredient: Ingredient):Sandwich {
        sandwich.addIngredient(ingredient)
        return sandwich
    }
}
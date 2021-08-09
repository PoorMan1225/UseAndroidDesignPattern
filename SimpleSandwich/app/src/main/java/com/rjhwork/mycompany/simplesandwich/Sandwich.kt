package com.rjhwork.mycompany.simplesandwich

import com.rjhwork.mycompany.simplesandwich.ingredient.Ingredient
import java.lang.StringBuilder

class Sandwich {
    private val ingredients = mutableListOf<Ingredient>()

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

    fun getKcal(): Int = ingredients.sumOf { it.kcal }

    fun getSandwich():String {
        val sb = StringBuilder()

        ingredients.forEach { ingredient ->
            sb.append("${ingredient.description}\n")
        }
        return sb.toString()
    }
}
package com.rjhwork.mycompany.builderpattern

import android.util.Log

class Sandwich {

    companion object {
        const val DEBUG_TAG = "tag"
    }

    private val ingredient = mutableListOf<Ingredient>()

    fun addIngredient(ingredient: Ingredient) {
        this.ingredient += ingredient
    }

    fun getCalories() = ingredient.sumOf { it.calories() }

    fun getSandwich() {
        ingredient.forEach { ingredient ->
            Log.d(DEBUG_TAG, "${ingredient.name()} : ${ingredient.calories()} kcal")
        }
    }
}
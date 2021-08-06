package com.rjhwork.mycompany.criteriapattern.filter

import com.rjhwork.mycompany.criteriapattern.model.Ingredient


class VegetarianFilter: Filter {

    override fun meetCriteria(ingredients: List<Ingredient>): List<Ingredient> {
        return ingredients.filter { it.vegetarian }
    }
}
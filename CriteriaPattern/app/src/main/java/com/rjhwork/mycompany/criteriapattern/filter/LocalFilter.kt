package com.rjhwork.mycompany.criteriapattern.filter

import com.rjhwork.mycompany.criteriapattern.model.Ingredient

class LocalFilter: Filter {
    override fun meetCriteria(ingredients: List<Ingredient>): List<Ingredient> {
       return ingredients.filter { it.local == "Locally produced" }
    }
}
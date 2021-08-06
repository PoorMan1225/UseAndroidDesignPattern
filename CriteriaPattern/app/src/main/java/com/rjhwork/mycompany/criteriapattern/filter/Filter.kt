package com.rjhwork.mycompany.criteriapattern.filter

import com.rjhwork.mycompany.criteriapattern.model.Ingredient

interface Filter {

    fun meetCriteria(ingredients: List<Ingredient>): List<Ingredient>
}
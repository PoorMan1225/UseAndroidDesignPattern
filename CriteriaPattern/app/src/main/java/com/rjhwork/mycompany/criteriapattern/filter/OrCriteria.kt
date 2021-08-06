package com.rjhwork.mycompany.criteriapattern.filter

import com.rjhwork.mycompany.criteriapattern.model.Ingredient

// or 조건의 경우.
class OrCriteria(
    private val filter: Filter,
    private val otherFilter: Filter
): Filter {

    override fun meetCriteria(ingredients: List<Ingredient>): List<Ingredient> {
        val firstCriteria = filter.meetCriteria(ingredients).toMutableList()
        val secondCriteria = otherFilter.meetCriteria(ingredients)

        val notContainList = secondCriteria.filter { firstCriteria.contains(it).not() }
        firstCriteria += notContainList
        return firstCriteria
    }
}
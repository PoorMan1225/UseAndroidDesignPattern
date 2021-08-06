package com.rjhwork.mycompany.criteriapattern.filter

import com.rjhwork.mycompany.criteriapattern.model.Ingredient


// And 조건의 검색.
class AndCriteria(
    private val filter: Filter,
    private val otherFilter: Filter
) : Filter{

    override fun meetCriteria(ingredients: List<Ingredient>): List<Ingredient> {
        val firstCriteria = filter.meetCriteria(ingredients) // 애먼저 검색.
        return otherFilter.meetCriteria(firstCriteria)       // 그다음 애 검색.
    }
}
package com.rjhwork.mycompany.criteriapattern.model

// 이름, 생산지, 채식인지 여부.
data class Ingredient(
    val name: String,
    val local: String,
    val vegetarian: Boolean
)
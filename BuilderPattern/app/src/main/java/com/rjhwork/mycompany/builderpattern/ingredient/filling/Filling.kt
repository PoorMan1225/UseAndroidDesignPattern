package com.rjhwork.mycompany.builderpattern.ingredient.filling

import com.rjhwork.mycompany.builderpattern.Ingredient

abstract class Filling: Ingredient {

    abstract override fun name(): String

    abstract override fun calories(): Int
}
package com.rjhwork.mycompany.builderpattern.ingredient.bread

import com.rjhwork.mycompany.builderpattern.Ingredient

abstract class Bread : Ingredient {

    abstract override fun name(): String

    abstract override fun calories(): Int
}
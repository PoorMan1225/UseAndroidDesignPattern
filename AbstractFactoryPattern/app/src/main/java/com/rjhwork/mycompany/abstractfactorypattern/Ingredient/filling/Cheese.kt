package com.rjhwork.mycompany.abstractfactorypattern.Ingredient.filling

class Cheese: Filling {
    override fun name(): String = "Cheese"

    override fun calories(): String = " : 75 kcal"
}
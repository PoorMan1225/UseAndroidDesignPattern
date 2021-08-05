package com.rjhwork.mycompany.abstractfactorypattern.Ingredient.factory

import com.rjhwork.mycompany.abstractfactorypattern.Ingredient.bread.Bread
import com.rjhwork.mycompany.abstractfactorypattern.Ingredient.filling.Cheese
import com.rjhwork.mycompany.abstractfactorypattern.Ingredient.filling.Filling
import com.rjhwork.mycompany.abstractfactorypattern.Ingredient.filling.Tomato

class FillingFactory: AbstractFactory() {
    override fun getBread(bread: String?): Bread? = null

    override fun getFilling(filling: String?): Filling? {
        filling ?: return null

        return when(filling) {
            "CHE" -> Cheese()
            "TOM" -> Tomato()
            else -> null
        }
    }
}
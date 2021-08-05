package com.rjhwork.mycompany.abstractfactorypattern.Ingredient.factory

import com.rjhwork.mycompany.abstractfactorypattern.Ingredient.bread.Baguette
import com.rjhwork.mycompany.abstractfactorypattern.Ingredient.bread.Bread
import com.rjhwork.mycompany.abstractfactorypattern.Ingredient.bread.Brioche
import com.rjhwork.mycompany.abstractfactorypattern.Ingredient.filling.Filling

class BreadFactory: AbstractFactory() {

    override fun getBread(bread: String?): Bread? {
        bread ?: return null

        return when(bread) {
            "BAG" -> Baguette()
            "BRI" -> Brioche()
            else -> null
        }
    }

    override fun getFilling(filling: String?): Filling? = null
}
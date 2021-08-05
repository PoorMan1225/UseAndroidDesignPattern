package com.rjhwork.mycompany.abstractfactorypattern.Ingredient.factory

import com.rjhwork.mycompany.abstractfactorypattern.Ingredient.bread.Bread
import com.rjhwork.mycompany.abstractfactorypattern.Ingredient.filling.Filling

abstract class AbstractFactory {

    abstract fun getBread(bread: String?): Bread?
    abstract fun getFilling(filling: String?): Filling?
}

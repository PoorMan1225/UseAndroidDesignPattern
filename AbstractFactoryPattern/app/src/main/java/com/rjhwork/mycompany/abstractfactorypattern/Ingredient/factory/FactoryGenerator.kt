package com.rjhwork.mycompany.abstractfactorypattern.Ingredient.factory

object FactoryGenerator {

    fun getFactory(factory: String?): AbstractFactory? {
        factory ?: return null

        return when(factory) {
            "BRE" -> BreadFactory()
            "FIL" -> FillingFactory()
            else -> null
        }
    }
}
package com.rjhwork.mycompany.factorypattern.ingredientBread

import com.rjhwork.mycompany.factorypattern.Bread

class Roll: Bread {
    override fun name() = "Roll"

    override fun calories() = " : 75 kcal"
}
package com.rjhwork.mycompany.simplesandwich.decorator

import com.rjhwork.mycompany.simplesandwich.ingredient.bread.Bread

class Toasted(private val bread:Bread) : BreadDecorator(){
    override val decoration: String = "Toasted"
    override val decorationKcal: Int = 0

    override val description: String = ""
    override val kcal: Int = 0
}
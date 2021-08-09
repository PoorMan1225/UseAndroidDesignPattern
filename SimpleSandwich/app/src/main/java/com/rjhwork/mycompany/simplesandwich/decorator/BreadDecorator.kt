package com.rjhwork.mycompany.simplesandwich.decorator

import com.rjhwork.mycompany.simplesandwich.ingredient.bread.Bread

abstract class BreadDecorator: Bread() {
    abstract override val decoration:String
    abstract override val decorationKcal: Int
}
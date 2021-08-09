package com.rjhwork.mycompany.decoratorpattern.decorator.bread

import com.rjhwork.mycompany.decoratorpattern.model.bread.Bread

class Toasted(private val bread: Bread): BreadDecorator() {

    override fun description(): String = bread.description + " Toasted"

    override fun kcal(): Int = bread.kcal + 0
}
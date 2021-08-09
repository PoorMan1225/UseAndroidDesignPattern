package com.rjhwork.mycompany.decoratorpattern.decorator.bread

import com.rjhwork.mycompany.decoratorpattern.model.bread.Bread

class Open(private val bread: Bread): BreadDecorator() {

    override fun description(): String = bread.description + " Open"

    override fun kcal(): Int = bread.kcal / 2
}
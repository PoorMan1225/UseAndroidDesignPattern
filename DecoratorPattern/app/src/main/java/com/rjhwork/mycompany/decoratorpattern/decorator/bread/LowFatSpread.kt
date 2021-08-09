package com.rjhwork.mycompany.decoratorpattern.decorator.bread

import com.rjhwork.mycompany.decoratorpattern.model.bread.Bread

// 저지방
class LowFatSpread(private val bread: Bread): BreadDecorator() {

    override fun description(): String = bread.description + " Low fat spread"

    override fun kcal(): Int = bread.kcal + 25
}
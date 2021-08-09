package com.rjhwork.mycompany.decoratorpattern.decorator.bread

import com.rjhwork.mycompany.decoratorpattern.model.bread.Bread

// 빵에다가 버터를 add 할 수 있다.
class Butter(private val bread: Bread): BreadDecorator() {

    override fun description(): String = bread.description + " Butter"

    override fun kcal(): Int = bread.kcal + 50
}
package com.rjhwork.mycompany.decoratorpattern.decorator.filling

import com.rjhwork.mycompany.decoratorpattern.model.filling.Filling

class DoublePortion(private val filling:Filling): FillingDecoration() {
    override fun description(): String = filling.description + " Double Portion"

    override fun kcal(): Int = filling.kcal * 2
}
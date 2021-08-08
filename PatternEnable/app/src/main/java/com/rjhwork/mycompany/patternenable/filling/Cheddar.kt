package com.rjhwork.mycompany.patternenable.filling

import com.rjhwork.mycompany.patternenable.R

class Cheddar() : Cheese() {
    override val name: String = "Cheddar"
    override val image: Int = R.drawable.cheddar
    override val kcal: Int = 130
    override val isVeg: Boolean = true
    override val price: Int = 75
}
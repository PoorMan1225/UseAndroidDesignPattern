package com.rjhwork.mycompany.patternenable.filling

import com.rjhwork.mycompany.patternenable.R

class Manchego() : Cheese() {
    override val name: String = "Manchego"
    override val image: Int = R.drawable.manchego
    override val kcal: Int = 250
    override val isVeg: Boolean = false
    override val price: Int = 180
}
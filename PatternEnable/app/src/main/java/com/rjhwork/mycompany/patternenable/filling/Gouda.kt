package com.rjhwork.mycompany.patternenable.filling

import com.rjhwork.mycompany.patternenable.R

class Gouda() : Cheese() {
    override val name: String = "Gouda"
    override val image: Int = R.drawable.gouda
    override val kcal: Int = 400
    override val isVeg: Boolean = false
    override val price: Int = 180
}
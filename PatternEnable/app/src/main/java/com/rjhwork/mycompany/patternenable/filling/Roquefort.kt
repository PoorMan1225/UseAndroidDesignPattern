package com.rjhwork.mycompany.patternenable.filling

import com.rjhwork.mycompany.patternenable.R

class Roquefort() : Cheese() {
    override val name: String = "Roquefort"
    override val image: Int = R.drawable.roquefort
    override val kcal: Int = 350
    override val isVeg: Boolean = true
    override val price: Int = 290
}
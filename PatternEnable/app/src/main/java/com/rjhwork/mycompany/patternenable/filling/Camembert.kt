package com.rjhwork.mycompany.patternenable.filling

import com.rjhwork.mycompany.patternenable.R

class Camembert() : Cheese() {
    override val name: String = "Brie"
    override val image: Int = R.drawable.camembert
    override val kcal: Int = 250
    override val isVeg: Boolean = true
    override val price: Int = 100
}
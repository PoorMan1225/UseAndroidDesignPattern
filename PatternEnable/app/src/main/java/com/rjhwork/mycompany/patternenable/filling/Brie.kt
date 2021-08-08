package com.rjhwork.mycompany.patternenable.filling

import com.rjhwork.mycompany.patternenable.R

class Brie() : Cheese() {
    override val name: String = "Brie"
    override val image: Int = R.drawable.brie
    override val kcal: Int = 150
    override val isVeg: Boolean = false
    override val price: Int = 80
}
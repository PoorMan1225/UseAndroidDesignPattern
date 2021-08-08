package com.rjhwork.mycompany.patternenable.filling

import com.rjhwork.mycompany.patternenable.R

class Emmental() : Cheese() {
    override val name: String = "Emmental"
    override val image: Int = R.drawable.emmental
    override val kcal: Int = 400
    override val isVeg: Boolean = true
    override val price: Int = 400
}
package com.rjhwork.mycompany.visitorpattern.item

import com.rjhwork.mycompany.visitorpattern.Visitor

class FreshFood(
    val costPerKilo:Int,
    val weight:Int,
    val name:String
): Item {
    override fun accept(visitor: Visitor): Int = visitor.visit(this)
}
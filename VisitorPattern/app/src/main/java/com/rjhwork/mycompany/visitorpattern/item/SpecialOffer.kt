package com.rjhwork.mycompany.visitorpattern.item

import com.rjhwork.mycompany.visitorpattern.Visitor

class SpecialOffer(
    val baseCost:Int,
    val quantity:Int,
    val name:String
): Item {

    override fun accept(visitor: Visitor): Int = visitor.visit(this)
}
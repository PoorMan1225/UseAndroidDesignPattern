package com.rjhwork.mycompany.visitorpattern

import com.rjhwork.mycompany.visitorpattern.item.CannedFood
import com.rjhwork.mycompany.visitorpattern.item.FreshFood
import com.rjhwork.mycompany.visitorpattern.item.SpecialOffer

interface Visitor {
    fun visit(canFood: CannedFood): Int
    fun visit(freshFood: FreshFood):Int
    fun visit(specialOffer: SpecialOffer): Int
}
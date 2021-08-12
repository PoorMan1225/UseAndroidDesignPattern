package com.rjhwork.mycompany.visitorpattern.implementation

import android.util.Log
import com.rjhwork.mycompany.visitorpattern.Visitor
import com.rjhwork.mycompany.visitorpattern.item.CannedFood
import com.rjhwork.mycompany.visitorpattern.item.FreshFood
import com.rjhwork.mycompany.visitorpattern.item.SpecialOffer

const val TAG = "MainActivity"

class CheckOut: Visitor {

    override fun visit(canFood: CannedFood): Int {
        val cost = canFood.cost
        val name = canFood.name
        Log.d(TAG, "can food name : $name")
        return cost
    }

    override fun visit(freshFood: FreshFood): Int {
        val cost = freshFood.costPerKilo * freshFood.weight
        val name = freshFood.name
        Log.d(TAG, "Fresh $name : $cost c")
        return cost
    }

    override fun visit(specialOffer: SpecialOffer): Int {
        val name = specialOffer.name
        var cost = specialOffer.baseCost
        val number = specialOffer.quantity
        cost *= number

        if(number > 1) {
            cost /= 2
        }

        Log.d(TAG, "Special offer $name : coast : c")
        return cost
    }
}
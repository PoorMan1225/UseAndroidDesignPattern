package com.rjhwork.mycompany.strategypattern.strategy

import com.rjhwork.mycompany.strategypattern.Strategy

class Card: Strategy {
    override fun processPayment(price: Float): String = "%.2f".format(price+0.25f)
}
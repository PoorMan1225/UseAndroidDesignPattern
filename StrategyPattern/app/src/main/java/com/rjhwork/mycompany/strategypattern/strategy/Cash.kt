package com.rjhwork.mycompany.strategypattern.strategy

import com.rjhwork.mycompany.strategypattern.Strategy

class Cash: Strategy {
    override fun processPayment(price: Float) = "%.2f".format(price)
}
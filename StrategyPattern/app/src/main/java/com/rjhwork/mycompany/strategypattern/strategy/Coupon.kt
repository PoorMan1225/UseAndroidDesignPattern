package com.rjhwork.mycompany.strategypattern.strategy

import com.rjhwork.mycompany.strategypattern.Strategy

class Coupon: Strategy {
    override fun processPayment(price: Float): String = "%.2f".format(price * 0.9f)
}
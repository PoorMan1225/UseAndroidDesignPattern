package com.rjhwork.mycompany.strategypattern


// 전략에 대한 정보를 제공한다.
class Payment(private val strategy: Strategy) {

    fun employStrategy(f: Float) = strategy.processPayment(f)
}
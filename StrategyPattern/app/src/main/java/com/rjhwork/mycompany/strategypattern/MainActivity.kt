package com.rjhwork.mycompany.strategypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.rjhwork.mycompany.strategypattern.strategy.Card
import com.rjhwork.mycompany.strategypattern.strategy.Cash
import com.rjhwork.mycompany.strategypattern.strategy.Coupon

class MainActivity : AppCompatActivity() {

    private val basicPrice = BasicPrice

    private val actionCash: Button by lazy {
        findViewById(R.id.cashButton)
    }

    private val actionCard: Button by lazy {
        findViewById(R.id.cardButton)
    }

    private val actionCoupon: Button by lazy {
        findViewById(R.id.voucherButton)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initBindViews()
    }

    private fun initBindViews() {
        actionCash.setOnClickListener(consumeListener)
        actionCard.setOnClickListener(consumeListener)
        actionCoupon.setOnClickListener(consumeListener)
    }

    private val consumeListener = View.OnClickListener { view ->

        val payment: Payment = when (view.id) {
            R.id.cardButton -> Payment(Card())
            R.id.voucherButton -> Payment(Coupon())
            else -> Payment(Cash())
        }

        val price = StringBuilder()
            .append("Total cost : $")
            .append(payment.employStrategy(basicPrice.price))
            .append("c")
            .toString()

        Log.d("MainActivity", price)
        Toast.makeText(this, price, Toast.LENGTH_SHORT).show()
    }
}
package com.rjhwork.mycompany.visitorpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.rjhwork.mycompany.visitorpattern.implementation.CheckOut
import com.rjhwork.mycompany.visitorpattern.item.CannedFood
import com.rjhwork.mycompany.visitorpattern.item.FreshFood
import com.rjhwork.mycompany.visitorpattern.item.Item
import com.rjhwork.mycompany.visitorpattern.item.SpecialOffer

class MainActivity : AppCompatActivity() {

    private val items = listOf<Item>(
        CannedFood(65, "Tomato soup"),
        FreshFood(60,2, "Banans"),
        CannedFood(45, "Baked beans"),
        FreshFood(45, 3, "Apples"),
        SpecialOffer(120, 5, "Orange Box")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val totalCost = getItemTotalCost()
        Log.d("MainActivity", "total cost : ${totalCost}")
    }

    private fun getItemTotalCost(): Int {
        val visitor = CheckOut()
        return items.sumOf { it.accept(visitor) }
    }
}
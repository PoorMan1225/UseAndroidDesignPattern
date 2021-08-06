package com.rjhwork.mycompany.facadepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val facade = Facade()
        facade.drink.dispense()
        facade.crisps.dispense()
        facade.fruit.dispense()
    }
}
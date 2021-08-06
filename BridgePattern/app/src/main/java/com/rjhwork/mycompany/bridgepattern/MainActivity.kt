package com.rjhwork.mycompany.bridgepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rjhwork.mycompany.bridgepattern.make.Close
import com.rjhwork.mycompany.bridgepattern.make.Open

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val openSandwich:AbstractSandwich = Sandwich("Cheese", "Pepper", Open())
        openSandwich.make()

        val closeSandwich:AbstractSandwich = Sandwich("Pickle" , "Tomato", Close())
        closeSandwich.make()
    }
}
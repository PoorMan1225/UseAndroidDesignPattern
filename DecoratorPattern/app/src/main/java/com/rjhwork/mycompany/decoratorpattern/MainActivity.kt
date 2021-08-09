package com.rjhwork.mycompany.decoratorpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rjhwork.mycompany.decoratorpattern.decorator.bread.LowFatSpread
import com.rjhwork.mycompany.decoratorpattern.decorator.bread.Open
import com.rjhwork.mycompany.decoratorpattern.decorator.bread.Toasted
import com.rjhwork.mycompany.decoratorpattern.model.bread.Bagel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bagel = Bagel()
        val spread = LowFatSpread(bagel)
        val toast = Toasted(spread)
        val open = Open(toast)
    }
}
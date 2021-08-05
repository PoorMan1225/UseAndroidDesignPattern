package com.rjhwork.mycompany.factorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.rjhwork.mycompany.factorypattern.factory.BreadFactory
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    private val textView by lazy {
        findViewById<TextView>(R.id.textView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val breadFactory = BreadFactory()
        val bread = breadFactory.getBread("BAG")

        bread?.let { it ->
            textView.text = StringBuilder()
                .append(it.name())
                .toString()
        }
    }
}
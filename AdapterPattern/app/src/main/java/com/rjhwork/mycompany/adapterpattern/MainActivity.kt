package com.rjhwork.mycompany.adapterpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.rjhwork.mycompany.adapterpattern.adapter.Adapter
import com.rjhwork.mycompany.adapterpattern.location.CustomerLocation

class MainActivity : AppCompatActivity() {

    private val textView: TextView by lazy {
        findViewById(R.id.textView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val oldLocation = CustomerLocation(3, "3", "Town Hall", "")
        val newLocation = Adapter(oldLocation)

        textView.text = StringBuilder()
            .append(newLocation.building)
            .append(", floor ")
            .append(newLocation.floor)
            .append(", desk ")
            .append(newLocation.desk)
            .toString()
    }
}


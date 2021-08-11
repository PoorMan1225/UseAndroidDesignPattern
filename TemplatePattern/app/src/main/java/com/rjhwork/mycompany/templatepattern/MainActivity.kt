package com.rjhwork.mycompany.templatepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var story:Story = News()

    private val button: Button by lazy {
        findViewById(R.id.action_change)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            story = if(story.source == "News")
                Sport()
            else
                News()

            story.publish(this)
        }
    }
}
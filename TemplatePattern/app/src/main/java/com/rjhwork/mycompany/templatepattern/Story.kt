package com.rjhwork.mycompany.templatepattern

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

// 기본 클래스
abstract class Story() {
    var source:String = ""

    fun publish(context: Context) {
        init(context)
        setText(context)
        setTitle(context)
        setImage(context)
        setDate(context)
    }

    abstract fun init(context:Context)

    abstract fun setTitle(context:Context)

    abstract fun setImage(context:Context)

    abstract fun setText(context: Context)

    @SuppressLint("SimpleDateFormat")
    fun setDate(context:Context) {
        val calendar = GregorianCalendar()
        val format = SimpleDateFormat("MMM d")

        val textDate = (context as Activity).findViewById<TextView>(R.id.text_date)
        textDate.text = format.format(calendar.time)
    }
}
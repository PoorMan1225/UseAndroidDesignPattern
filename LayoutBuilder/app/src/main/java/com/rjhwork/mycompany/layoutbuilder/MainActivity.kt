package com.rjhwork.mycompany.layoutbuilder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView:TextView? = null
    private lateinit var linearLayout:LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        val width:Int = ViewGroup.LayoutParams.MATCH_PARENT
        val height:Int = ViewGroup.LayoutParams.WRAP_CONTENT

        super.onCreate(savedInstanceState)

        linearLayout = LinearLayout(this)
        linearLayout.apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = ViewGroup.LayoutParams(width, height)
        }

        setContentView(linearLayout)

        val layoutBuilder = LayoutBuilder()
        val layoutViews = layoutBuilder.displayDetailed()

        layoutViews.forEach { layoutView ->
            textView = TextView(this).apply {
                setText(layoutView.content)
                Log.d("MainActivity", "${layoutView.content}")
                setTextSize(TypedValue.COMPLEX_UNIT_SP, layoutView.textSize.toFloat())
                setTextColor(layoutView.shading.shade)
                setBackgroundResource(layoutView.shading.background)

                val pad = layoutView.padding
                setPadding(dp(pad[0]), dp(pad[1]), dp(pad[2]), dp(pad[3]))
            }
            linearLayout.addView(textView)
        }
    }

    private fun dp(px:Int): Int {
        val scale = resources.displayMetrics.density
        return (px * scale + 0.5f).toInt()
    }
}
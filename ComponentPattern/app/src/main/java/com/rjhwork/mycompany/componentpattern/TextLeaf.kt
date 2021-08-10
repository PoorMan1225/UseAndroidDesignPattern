package com.rjhwork.mycompany.componentpattern

import android.util.TypedValue
import android.view.ViewGroup
import android.widget.TextView
import com.rjhwork.mycompany.componentpattern.Until.dp

class TextLeaf(
    private val textView: TextView,
    private val id: Int
) : Component {

    init {
        setContent(id)
    }

    override fun add(component: Component) = Unit

    override fun setContent(id: Int) {
        textView.setText(id)

        textView.apply {
            setPadding(
                dp(this, 24),
                dp(this, 0),
                dp(this, 0),
                dp(this, 16)
            )

            setTextSize(TypedValue.COMPLEX_UNIT_SP, 24.toFloat())
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }
    }

    override fun inflate(layout: ViewGroup) {
        layout.addView(textView)
    }
}
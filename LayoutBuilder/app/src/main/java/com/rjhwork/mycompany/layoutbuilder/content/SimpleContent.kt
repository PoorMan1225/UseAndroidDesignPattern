package com.rjhwork.mycompany.layoutbuilder.content

import android.view.ViewGroup
import com.rjhwork.mycompany.layoutbuilder.R

class SimpleContent: Content() {

    override val layoutParams: ViewGroup.LayoutParams = getLayoutParams()

    override val textSize: Int = 14

    override val content: Int = R.string.short_text

    override val padding: IntArray = intArrayOf(16, 18, 16, 16)

    @JvmName("getLayoutParams1")
    private fun getLayoutParams(): ViewGroup.LayoutParams {
        val width = ViewGroup.LayoutParams.MATCH_PARENT
        val height = ViewGroup.LayoutParams.WRAP_CONTENT
        return ViewGroup.LayoutParams(width, height)
    }
}
package com.rjhwork.mycompany.layoutbuilder.headline

import android.view.ViewGroup
import com.rjhwork.mycompany.layoutbuilder.R

class SubHeadline: Header(){
    override val layoutParams: ViewGroup.LayoutParams = getLayoutParams()

    override val textSize: Int = 18

    override val content: Int = R.string.sub_head

    override val padding: IntArray = intArrayOf(32, 0, 16, 8)

    @JvmName("getLayoutParams1")
    private fun getLayoutParams(): ViewGroup.LayoutParams {
        val width = ViewGroup.LayoutParams.MATCH_PARENT
        val height = ViewGroup.LayoutParams.WRAP_CONTENT
        return ViewGroup.LayoutParams(width, height)
    }
}
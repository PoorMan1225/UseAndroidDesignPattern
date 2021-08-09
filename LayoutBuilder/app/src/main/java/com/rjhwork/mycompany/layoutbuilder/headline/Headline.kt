package com.rjhwork.mycompany.layoutbuilder.headline

import android.view.ViewGroup
import com.rjhwork.mycompany.layoutbuilder.R

class Headline : Header() {

    override val layoutParams: ViewGroup.LayoutParams = getLayoutParams()

    @JvmName("getLayoutParams1")
    private fun getLayoutParams(): ViewGroup.LayoutParams {
        val width = ViewGroup.LayoutParams.MATCH_PARENT
        val height = ViewGroup.LayoutParams.WRAP_CONTENT
        return ViewGroup.LayoutParams(width, height)
    }

    override val textSize: Int = 24

    override val content: Int = R.string.headline

    override val padding: IntArray = intArrayOf(24, 16, 16, 0) // 위, 좌, 우, 아래

}
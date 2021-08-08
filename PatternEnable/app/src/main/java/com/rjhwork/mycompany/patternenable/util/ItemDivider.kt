package com.rjhwork.mycompany.patternenable.util

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class ItemDivider private constructor(): RecyclerView.ItemDecoration() {
    private val ATTRS:IntArray = intArrayOf(android.R.attr.listDivider)
    private var divider: Drawable? = null

    constructor(context: Context) : this() {
        val styledAttributes = context.obtainStyledAttributes(ATTRS)
        divider = styledAttributes.getDrawable(0)
        styledAttributes.recycle()
    }

    constructor(context: Context, resId:Int) : this() {
        divider = ContextCompat.getDrawable(context, resId)
    }

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        divider ?: return

        val left = parent.paddingLeft
        val right = parent.width - parent.paddingRight

        val count = parent.childCount
        for(i in 0 until count) {
            val child = parent.getChildAt(i)

            val params = child.layoutParams as RecyclerView.LayoutParams

            val top = child.bottom + params.bottomMargin
            val bottom = top + divider!!.intrinsicHeight

            divider?.let {
                it.setBounds(left, top, right, bottom) // 그리기전 높이 지정해주는 함수.
                it.draw(c)
            }
        }
    }
}
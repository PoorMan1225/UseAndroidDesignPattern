package com.rjhwork.mycompany.layoutbuilder

import android.view.ViewGroup

interface LayoutView {

    val layoutParams : ViewGroup.LayoutParams
    val textSize: Int
    val content: Int
    val shading:Shading
    val padding:IntArray
}
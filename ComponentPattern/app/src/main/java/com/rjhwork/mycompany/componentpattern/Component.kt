package com.rjhwork.mycompany.componentpattern

import android.view.ViewGroup

interface Component {
    fun add(component:Component)
    fun setContent(id:Int)
    fun inflate(layout: ViewGroup)
}
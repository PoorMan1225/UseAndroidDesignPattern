package com.rjhwork.mycompany.layoutbuilder

import com.rjhwork.mycompany.layoutbuilder.content.DetailContent
import com.rjhwork.mycompany.layoutbuilder.content.SimpleContent
import com.rjhwork.mycompany.layoutbuilder.headline.Headline
import com.rjhwork.mycompany.layoutbuilder.headline.SubHeadline

class LayoutBuilder {

    fun displayDetailed(): MutableList<LayoutView> {
        val views = mutableListOf<LayoutView>(
            Headline(),
            SubHeadline(),
            DetailContent()
        )
        return views
    }

    fun displaySimple(): MutableList<LayoutView> {
        val views = mutableListOf<LayoutView>(
            Headline(),
            SimpleContent()
        )
        return views
    }
}
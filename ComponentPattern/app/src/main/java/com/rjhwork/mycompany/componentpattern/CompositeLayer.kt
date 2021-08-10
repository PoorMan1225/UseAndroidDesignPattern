package com.rjhwork.mycompany.componentpattern

import android.view.ViewGroup
import android.widget.LinearLayout

class CompositeLayer(
    private val linearLayout: LinearLayout,
    private val id: Int) : Component {

    private val components = mutableListOf<Component>()

    init {
        setContent(id)
    }

    override fun add(component: Component) {
        components.add(component)
    }

    override fun setContent(id: Int) = linearLayout.setBackgroundResource(id)


    override fun inflate(layout: ViewGroup) {
        layout.addView(linearLayout)

        components.forEach { component ->
            component.inflate(linearLayout)
        }
    }
}
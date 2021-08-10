package com.rjhwork.mycompany.componentpattern

import android.view.ViewGroup
import android.widget.ImageView

class CompositeImage(
    private val imageView: ImageView,
    private val id: Int) : Component {

    init {
        setContent(id)
    }

    private val components = mutableListOf<Component>()

    override fun add(component: Component) {
        components.add(component)
    }

    override fun setContent(id: Int) {
        imageView.setImageResource(id)
    }

    override fun inflate(layout: ViewGroup) {
        layout.addView(imageView)

        components.forEach { component ->
            component.inflate(layout)
        }
    }
}
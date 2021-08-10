package com.rjhwork.mycompany.componentpattern

import android.view.ViewGroup

class CompositeShell: Component {

    private val components = mutableListOf<Component>()

    override fun add(component: Component) {
        components.add(component)
    }

    override fun setContent(id: Int) = Unit

    override fun inflate(layout: ViewGroup) {
        components.forEach { component ->
            component.inflate(layout)
        }
    }
}
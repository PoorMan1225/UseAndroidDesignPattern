package com.rjhwork.mycompany.layoutbuilder.content

import com.rjhwork.mycompany.layoutbuilder.LayoutView
import com.rjhwork.mycompany.layoutbuilder.Shading

abstract class Content: LayoutView {
    override val shading: Shading
        get() = ContentShading()
}
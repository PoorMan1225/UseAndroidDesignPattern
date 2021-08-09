package com.rjhwork.mycompany.layoutbuilder.headline

import com.rjhwork.mycompany.layoutbuilder.LayoutView
import com.rjhwork.mycompany.layoutbuilder.Shading

abstract class Header: LayoutView {
    override val shading: Shading
        get() = HeaderShading()
}
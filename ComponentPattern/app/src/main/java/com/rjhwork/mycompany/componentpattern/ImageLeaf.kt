package com.rjhwork.mycompany.componentpattern

import android.view.ViewGroup
import android.widget.ImageView
import com.rjhwork.mycompany.componentpattern.Until.dp

class ImageLeaf(
    private val imageView: ImageView,
    private val id: Int) : Component {

    init {
        setContent(id)
    }

    override fun add(component: Component) = Unit

    override fun setContent(id: Int) {
        imageView.scaleType = ImageView.ScaleType.FIT_CENTER

        imageView.layoutParams =
            ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                dp(imageView, R.dimen.imageHeight)
            )

        imageView.setImageResource(id)
    }

    override fun inflate(layout: ViewGroup) = layout.addView(imageView)
}
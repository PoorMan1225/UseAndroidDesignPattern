package com.rjhwork.mycompany.componentpattern

import android.content.Context
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class Builder(private val context: Context) {

    var text:Component = TextLeaf(TextView(context), R.string.head_line)
    var imageView:Component = ImageLeaf(ImageView(context), R.drawable.ic_launcher_background)
    var headerGroup = headerGroup()
    val sandwichLayer = sandwichLayout()

    private fun headerGroup():Component {
        val c = CompositeImage(ImageView(context), R.drawable.ic_launcher_background)
        c.add(text)
        return c
    }

    private fun sandwichArray(): Component {
        return CompositeShell().apply {
            add(setText(R.string.head_line))
            add(setImage(R.drawable.ic_launcher_background))
        }
    }

    private fun sandwichLayout(): Component {
        val c = CompositeLayer(LinearLayout(context), R.color.purple_200)
        c.add(sandwichArray())
        return c
    }

    private fun setText(t: Int): Component = TextLeaf(TextView(context), t)

    private fun setImage(i: Int): Component = ImageLeaf(ImageView(context), i)

}
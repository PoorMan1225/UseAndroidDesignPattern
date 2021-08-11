package com.rjhwork.mycompany.templatepattern

import android.app.Activity
import android.content.Context
import android.widget.ImageView
import android.widget.TextView

class News: Story() {
    private lateinit var textHeadline: TextView
    private lateinit var textView:TextView
    private lateinit var imageView: ImageView

    override fun init(context: Context) {
        source = "News"
        textHeadline = (context as Activity).findViewById(R.id.text_head_line)
        textView = (context as Activity).findViewById(R.id.text_view)
        imageView = (context as Activity).findViewById(R.id.image_view)
    }

    override fun setTitle(context: Context) {
        (context as Activity).title = context.getString(R.string.news_title)
    }

    override fun setImage(context: Context) {
        if(::imageView.isInitialized) {
            imageView.setImageResource(R.drawable.news)
        }
    }

    override fun setText(context: Context) {
        if(::textView.isInitialized) {
            textHeadline.setText(R.string.news_headline)
            textView.setText(R.string.news_content)
        }
    }
}
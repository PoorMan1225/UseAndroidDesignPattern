package com.rjhwork.mycompany.templatepattern.templateextension

import android.util.Log

abstract class Book: ReadingMaterial() {

    override fun fetchDocument() {
        super.fetchDocument()
        author()
    }

    private fun author() {
        Log.d(TAG, doc.author)
    }

    override fun id() {
        Log.d(TAG, "ISBN : ${doc.id}")
    }

    override fun date() {
        Log.d(TAG, doc.date)
    }

    abstract fun rating()
}
package com.rjhwork.mycompany.templatepattern.templateextension

import android.util.Log

const val TAG = "MainActivity"

abstract class ReadingMaterial {

    lateinit var doc : Document

    open fun fetchDocument() {
        init()
        title()
        genre()
        id()
        date()
        edition()
    }

    private fun init() {
        doc = Document()
    }

    abstract fun id()

    abstract fun date()

    private fun title() {
        Log.d(TAG, doc.title)
    }

    private fun genre() {
        Log.d(TAG, doc.genre)
    }

    open fun edition() {
        Log.d(TAG, doc.edition)
    }
}
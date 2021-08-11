package com.rjhwork.mycompany.templatepattern.templateextension

import android.util.Log

abstract class Magazine : ReadingMaterial(){

    override fun id() {
        Log.d(TAG, "ISSN : ${doc.id}")
    }

    override fun edition() {
        super.edition()
        Log.d(TAG, "ISSN : ${doc.period}")
    }
}
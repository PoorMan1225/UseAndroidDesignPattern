package com.rjhwork.mycompany.templatepattern.templateextension.implementation

import android.util.Log
import com.rjhwork.mycompany.templatepattern.templateextension.Book
import com.rjhwork.mycompany.templatepattern.templateextension.TAG

class SelectedBook: Book() {

    override fun rating() {
        Log.d(TAG, "4 stars")
    }
}
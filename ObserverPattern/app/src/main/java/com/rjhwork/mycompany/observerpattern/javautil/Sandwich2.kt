package com.rjhwork.mycompany.observerpattern.javautil

import java.util.*

class Sandwich2(private var ready:Boolean) : Observable() {

    fun getReady() = ready

    fun setReady(ready:Boolean) {
        this.ready = ready
        setChanged()
        notifyObservers()
    }
}
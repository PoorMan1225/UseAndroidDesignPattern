package com.rjhwork.mycompany.observerpattern

interface Subject {
    fun register(o:Observer): Unit
    fun unregister(o:Observer) : Unit
    fun getReady():Boolean
    fun setReady(b:Boolean)
    fun notifyObserver()
}
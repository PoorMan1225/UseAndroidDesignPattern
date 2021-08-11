package com.rjhwork.mycompany.observerpattern

class Sandwich : Subject {

    private val orders = mutableListOf<Observer>()
    private var ready: Boolean = false

    override fun register(o: Observer) {
        orders.add(o)
    }

    override fun unregister(o: Observer) {
        orders.remove(o)
    }

    override fun getReady(): Boolean = ready

    override fun setReady(b: Boolean) {
        this.ready = b
    }

    override fun notifyObserver() {
        orders.forEach { order ->
            order.update()
        }
    }
}
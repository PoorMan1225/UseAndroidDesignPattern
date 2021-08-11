package com.rjhwork.mycompany.observerpattern

class Order(private val subject: Subject): Observer {

    override fun update():String {
        return if(subject.getReady()) {
            subject.unregister(this)
            "Your order is ready to collect"
        }else {
            "Your sandwich will be ready very soon"
        }
    }
}
package com.rjhwork.mycompany.observerpattern.javautil

import java.util.*

class Order2: Observer {

    private var update:String = ""

    override fun update(o: Observable?, arg: Any?) {
        val sandwich = o as Sandwich2

        update = if(sandwich.getReady()) {
            o.deleteObserver(this)
            "Your order is ready to collect"
        }else {
            "Your sandwich will be ready very soon"
        }
    }
}
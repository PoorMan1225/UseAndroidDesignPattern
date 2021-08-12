package com.rjhwork.mycompany.visitorpattern.item

import com.rjhwork.mycompany.visitorpattern.Visitor

interface Item {
    fun accept(visitor: Visitor):Int
}
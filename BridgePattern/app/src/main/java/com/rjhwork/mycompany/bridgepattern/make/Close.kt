package com.rjhwork.mycompany.bridgepattern.make

import com.rjhwork.mycompany.bridgepattern.SandwichInterface

// 닫아서 샌드위치 완성.
class Close : SandwichInterface{
    override fun makeSandwich(fillng1: String, filling2:String) {
        println("Close $fillng1 $filling2")
    }
}
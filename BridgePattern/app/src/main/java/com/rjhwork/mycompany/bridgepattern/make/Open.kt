package com.rjhwork.mycompany.bridgepattern.make

import com.rjhwork.mycompany.bridgepattern.SandwichInterface

// 샌드위치를 열어서 만듬
// 익명객체로 만들어도 별 상관 없음.
class Open : SandwichInterface{
    override fun makeSandwich(fillng1: String, filling2:String) {
        println("Open $fillng1 $filling2")
    }
}
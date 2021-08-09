package com.rjhwork.mycompany.prototypepattern

abstract class Sequence : Cloneable {
    var result:Long = 0L
    var id:String = ""

    public override fun clone(): Sequence {
        return this
    }
}
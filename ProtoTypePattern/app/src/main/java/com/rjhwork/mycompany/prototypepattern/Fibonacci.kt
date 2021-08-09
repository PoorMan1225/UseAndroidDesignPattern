package com.rjhwork.mycompany.prototypepattern

class Fibonacci: Sequence() {

    init {
        result = nthFib(100)
    }

    companion object {
        fun nthFib(n:Int): Long {
            var f = 0L
            var g = 1L

            for(i in 1..n) {
                f += g
                g = f - g
            }
            return f
        }
    }
}
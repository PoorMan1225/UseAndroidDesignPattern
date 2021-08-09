package com.rjhwork.mycompany.prototypepattern

class Prime : Sequence() {

    init {
        result = nthPrime(10000)
    }

    companion object {
        fun nthPrime(n : Int):Long {
            val i = 2
            var count = 0

            (i until n).forEach { idx ->
                if(isPrime(idx)){
                    ++count
                }
            }
            return (i - 1).toLong()
        }

        private fun isPrime(idx: Int): Boolean {
            for(i in 2 until idx) {
                if(idx % i == 0) {
                    return false
                }
            }
            return true
        }
    }
}
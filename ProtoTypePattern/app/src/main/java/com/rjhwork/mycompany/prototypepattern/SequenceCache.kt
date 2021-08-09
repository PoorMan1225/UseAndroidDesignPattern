package com.rjhwork.mycompany.prototypepattern

import java.util.*

class SequenceCache {

    companion object {
        private val sequenceTable = Hashtable<String, Sequence>()

        // 캐시에 있는 정보를 clone 해서 계속 가지고 온다.
        fun getSequence(sequenceId: String): Sequence? {
            val cachedSequence = sequenceTable[sequenceId]
            return cachedSequence?.clone()
        }

        fun loadCache() {
            val prime = Prime()
            prime.id = "1"
            sequenceTable[prime.id] = prime

            val fib = Fibonacci()
            fib.id = "2"
            sequenceTable[fib.id] = fib
        }
    }
}
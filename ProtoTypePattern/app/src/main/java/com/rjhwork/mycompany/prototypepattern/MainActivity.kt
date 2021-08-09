package com.rjhwork.mycompany.prototypepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    private val textView: TextView by lazy {
        findViewById(R.id.textView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SequenceCache.loadCache()

        // 소수를 계산하고 결과를 보여준다.
        val prime = SequenceCache.getSequence("1")

        prime?.let {
            textView.append(StringBuilder()
                .append(getString(R.string.prime_text))
                .append(prime.result)
                .append("\n")
                .toString())
        }


        // 피보나치 수열을 계산하고 결과를 보여준다.
        val fib = SequenceCache.getSequence("2")

        fib?.let {
            textView.append(StringBuilder()
                .append(getString(R.string.fib_text))
                .append(fib.result)
                .toString())
        }
    }
}
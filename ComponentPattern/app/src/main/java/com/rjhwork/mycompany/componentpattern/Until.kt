package com.rjhwork.mycompany.componentpattern

import android.view.View

object Until {
    fun dp(view: View, px: Int): Int {
        val scale =
            view.resources
                .displayMetrics
                .density

        return (px * scale + 0.5f).toInt()
    }
}
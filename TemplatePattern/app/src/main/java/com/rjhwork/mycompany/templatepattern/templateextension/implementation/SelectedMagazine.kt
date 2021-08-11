package com.rjhwork.mycompany.templatepattern.templateextension.implementation

import android.annotation.SuppressLint
import android.util.Log
import com.rjhwork.mycompany.templatepattern.templateextension.Magazine
import com.rjhwork.mycompany.templatepattern.templateextension.TAG
import java.text.SimpleDateFormat
import java.util.*

class SelectedMagazine: Magazine() {

    @SuppressLint("SimpleDateFormat")
    override fun date() {
        val calendar = GregorianCalendar()
        val format = SimpleDateFormat("MM-d yyyy")
        format.timeZone = calendar.timeZone
        Log.d(TAG, format.format(calendar.time))
    }
}
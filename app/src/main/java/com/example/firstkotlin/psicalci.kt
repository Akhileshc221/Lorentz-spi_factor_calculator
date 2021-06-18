package com.example.firstkotlin

import android.icu.util.Calendar
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.*

class psicalci : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psicalci)
        val calendar: Calendar = Calendar.getInstance()
        val hour24hrs: Int = calendar.get(Calendar.HOUR_OF_DAY)

        val minutes: Int = calendar.get(Calendar.MINUTE)
        val seconds: Int = calendar.get(Calendar.SECOND)

        var factorial: Long = 1
        for (i in 1..hour24hrs) {
            // factorial = factorial * i;
            factorial *= i.toLong()
        }
        val tm3 = minutes*minutes*minutes
        val temp1 =tm3+seconds
        val spi = factorial/temp1
        val display = spi.toString()
        Toast.makeText(this, display, Toast.LENGTH_SHORT).show()





    }
}
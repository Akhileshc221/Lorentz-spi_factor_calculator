package com.example.firstkotlin

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import kotlin.math.sqrt


class practice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice)
        val c =300000000
        // finding the button
        val showButton = findViewById<Button>(R.id.check_button)
        val editText = findViewById<EditText>(R.id.v_value)
        val editText2 = findViewById<EditText>(R.id.l_value)
        showButton.setOnClickListener {

            // Getting the user input
            val v = editText.text.toString()
            val l = editText2.text.toString()
            val v2: Double? = v.toDoubleOrNull()
            val temp="Error in input"
            if(v2==null){
                Toast.makeText(this, temp, Toast.LENGTH_SHORT).show()
            }
            else{
            var x1=v2/c
            var x2=x1*x1
            val o=1
            var x3=(o-x2).toDouble()
            var x4= sqrt(x3)
            var x5=1/x4
            var t1=x5.toString()
            if(l==t1) {
                // set the color to relative layout
                val temp1="Correct answer"
                    Toast.makeText(this, temp1, Toast.LENGTH_LONG).show()
                val intent1 = Intent(this, Green::class.java)
                startActivity(intent1)

                }
            else{
                val temp2=" wrong answer"
                val temp3= temp2 + t1
                Toast.makeText(this, temp3, Toast.LENGTH_LONG).show()

                fun vibratePhone(){
                    val v = (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator)
                    // Vibrate for 500 milliseconds
                    // Vibrate for 500 milliseconds
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        v.vibrate(VibrationEffect.createOneShot(500,
                            VibrationEffect.DEFAULT_AMPLITUDE))
                    }
                    else {
                        v.vibrate(500)
                    }
                }
                vibratePhone()
                val intent2 = Intent(this, Red::class.java)
                startActivity(intent2)
            }
                }

            }
            // Showing the user input

        }


}

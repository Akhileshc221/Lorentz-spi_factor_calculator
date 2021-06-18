package com.example.firstkotlin
import android.content.Intent
import android.icu.math.BigDecimal
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.*
class Lorentzcalci : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lorentzcalci)
        val c =300000000

        val showButton = findViewById<Button>(R.id.calculate_button)

        val editText = findViewById<EditText>(R.id.cost_of_service)

        val btn_get_started2: Button = findViewById(R.id.btn_get_started2)
        btn_get_started2.setOnClickListener {
            val intent2 = Intent(this, practice::class.java)
            startActivity(intent2)

        }

        // Setting On Click Listener
        showButton.setOnClickListener {
            //val simp = 3/6
            // Getting the user input
            val v = editText.text.toString()
            val v2: Double? = v.toDoubleOrNull()
            if (v2==null){
                var answer =1
                var t1= "Enter properly"
                Toast.makeText(this, t1, Toast.LENGTH_SHORT).show()
            }
            else if (v2>c){
                val t2="Check your data properly"
                Toast.makeText(this, t2, Toast.LENGTH_SHORT).show()
            }
            else{
                var x1=(v2/c).toBigDecimal()
                var x2=x1*x1
                val o=1.toBigDecimal()
                var x3=(o-x2).toDouble()
                var x4=sqrt(x3)
                var x5=1/x4
                var t1=x5.toString()
                Toast.makeText(this, t1, Toast.LENGTH_SHORT).show()

            }
            // Showing the user input

        }

    }
}


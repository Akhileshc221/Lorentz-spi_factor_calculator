package com.example.firstkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_get_started: Button = findViewById(R.id.btn_get_started)
        btn_get_started.setOnClickListener {
            val intent = Intent(this, Lorentzcalci::class.java)
            startActivity(intent)
        }
        val btn_get_started1: Button = findViewById(R.id.btn_get_started1)
        btn_get_started1.setOnClickListener {
            val intent1 = Intent(this, psicalci::class.java)
            startActivity(intent1)
        }

    }
}


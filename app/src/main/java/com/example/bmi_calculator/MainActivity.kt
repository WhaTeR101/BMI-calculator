package com.example.bmi_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val h = findViewById<TextView>(R.id.height).text.toString().toFloat()/100
            val w = findViewById<TextView>(R.id.weight).text.toString().toFloat()/100
            val res = w/(h*h)
            findViewById<TextView>(R.id.result).text = "%.2f".format(res)
        }
    }
}
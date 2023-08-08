package com.example.aiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val liczba: TextView = findViewById(R.id.editTextText)
        val button: Button = findViewById(R.id.button)
        val odp: TextView = findViewById(R.id.textView2)
        val ifP: IfPlural = IfPlural()

        button.setOnClickListener {
            try {
                ifP.setNumber(liczba.text.toString().toInt())
                if (ifP.getResult()) {
                    odp.text = "Twoja liczba jest parzysta"
                } else {
                    odp.text = "Twoja liczba nie jest parzysta"
                }
            } catch (e: Exception){}
        }
    }
}
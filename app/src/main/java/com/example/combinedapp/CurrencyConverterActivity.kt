package com.example.combinedapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CurrencyConverterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency_converter)

        val textCurrencyConverter = findViewById<TextView>(R.id.text_currency_converter)


        val data = intent.getStringExtra("data")
        textCurrencyConverter.text = "Received data: $data"
    }
}
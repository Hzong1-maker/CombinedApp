package com.example.combinedapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FruitSelectorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_selector)

        val textFruitSelector = findViewById<TextView>(R.id.text_fruit_selector)


        val data = intent.getStringExtra("data")
        textFruitSelector.text = "Received data: $data"
    }
}
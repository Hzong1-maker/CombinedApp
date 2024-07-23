package com.example.combinedapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFruitSelector = findViewById<Button>(R.id.button_fruit_selector)
        val buttonCurrencyConverter = findViewById<Button>(R.id.button_currency_converter)

        buttonFruitSelector.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                FruitSelectorActivity::class.java
            )
            intent.putExtra("data", "some data to pass to FruitSelector")
            startActivity(intent)
        }

        buttonCurrencyConverter.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                CurrencyConverterActivity::class.java
            )
            intent.putExtra("data", "some data to pass to CurrencyConverter")
            startActivity(intent)
        }
    }
}
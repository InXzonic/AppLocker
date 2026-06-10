package com.example.applocker

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin)

        val pinInput = findViewById<EditText>(R.id.pinInput)
        val saveButton = findViewById<Button>(R.id.savePin)

        saveButton.setOnClickListener {

            val pin = pinInput.text.toString()

            if (pin.length != 4) {
                Toast.makeText(this, "Enter a 4-digit PIN", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val prefs = getSharedPreferences("AppLocker", Context.MODE_PRIVATE)

            prefs.edit()
                .putString("pin", pin)
                .apply()

            Toast.makeText(this, "PIN Saved Successfully", Toast.LENGTH_SHORT).show()
        }
    }
}
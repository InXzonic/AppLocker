package com.example.applocker

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPin = findViewById<Button>(R.id.btnPin)
        val btnFingerprint = findViewById<Button>(R.id.btnFingerprint)

        btnPin.setOnClickListener {
            Toast.makeText(this, "PIN feature coming soon", Toast.LENGTH_SHORT).show()
        }

        btnFingerprint.setOnClickListener {
            Toast.makeText(this, "Fingerprint feature coming soon", Toast.LENGTH_SHORT).show()
        }
    }
}
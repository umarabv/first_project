package com.example.firstprojectumardht_2_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<TextView>(R.id.vate)

        btn.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }

    }
}
package com.example.firstprojectumardht_2_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btn = findViewById<Button>(R.id.VK_23)

        btn.setOnClickListener {
            startActivity(Intent(this, Vk_1::class.java))
        }

    }
}
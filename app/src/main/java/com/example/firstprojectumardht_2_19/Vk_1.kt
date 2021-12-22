package com.example.firstprojectumardht_2_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Vk_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vk1)
        val btn = findViewById<Button>(R.id.Vk_Back)

        btn.setOnClickListener {
            startActivity(Intent(this, MainActivity5::class.java))
        }
    }
}
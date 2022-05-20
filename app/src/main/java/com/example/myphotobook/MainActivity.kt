package com.example.myphotobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnButton1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnButton1 = findViewById(R.id.btnButton1)
        btnButton1.setOnClickListener {
            val intent = Intent(this, PhotoBook2::class.java)
            startActivity(intent)
        }
    }
}
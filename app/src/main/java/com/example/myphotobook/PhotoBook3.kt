package com.example.myphotobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhotoBook3 : AppCompatActivity() {
    lateinit var btnCancel2: Button
    lateinit var btnNext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_book3)
        btnCancel2 = findViewById(R.id.btnCancel2)
        btnCancel2.setOnClickListener {
            val intent = Intent(this, PhotoBook2::class.java)
            startActivity(intent)
        }
        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent = Intent(this, PhotoBook4::class.java)
            startActivity(intent)
        }
    }
}
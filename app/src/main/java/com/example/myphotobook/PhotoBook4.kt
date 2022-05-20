package com.example.myphotobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhotoBook4 : AppCompatActivity() {
    lateinit var btnCancel3: Button
    lateinit var btnNext4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_book4)
        btnCancel3 = findViewById(R.id.btnCancel3)
        btnCancel3.setOnClickListener {
            val intent = Intent(this, PhotoBook3::class.java)
            startActivity(intent)
        }
        btnNext4 = findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent = Intent(this, PhotoBook5::class.java)
            startActivity(intent)
        }
    }
}
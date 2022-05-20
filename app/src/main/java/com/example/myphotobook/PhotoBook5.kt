package com.example.myphotobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhotoBook5 : AppCompatActivity() {
    lateinit var btnCancel4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_book5)
        btnCancel4 = findViewById(R.id.btnCancel4)
        btnCancel4.setOnClickListener {
            val intent = Intent(this, PhotoBook4::class.java)
            startActivity(intent)
        }

    }
}
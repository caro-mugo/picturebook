package com.example.myphotobook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PhotoBook2 : AppCompatActivity() {
    lateinit var btnCancel1:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_book2)
        btnCancel1=findViewById(R.id.btnCancel1)
        btnCancel1.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNext2=findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent= Intent(this,PhotoBook3::class.java)
            startActivity(intent)
        }

    }
}
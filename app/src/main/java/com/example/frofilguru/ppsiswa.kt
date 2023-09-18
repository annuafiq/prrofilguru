package com.example.frofilguru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ppsiswa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ppsiswa)

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent2 = Intent ( this, MainActivity::class.java)
            startActivity(intent2)
        }
    }
}
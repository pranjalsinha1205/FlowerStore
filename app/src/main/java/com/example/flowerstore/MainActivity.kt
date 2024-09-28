package com.example.flowerstore

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn = findViewById<ImageButton>(R.id.start)
        val btnTxt = findViewById<TextView>(R.id.startText)

        fun onClickNext(){
            var i = Intent(this, FlowerBuy::class.java)
            startActivity(i)
        }

        btn.setOnClickListener {
            onClickNext()
        }

        btnTxt.setOnClickListener {
            onClickNext()
        }
    }
}
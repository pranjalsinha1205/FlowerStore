package com.example.flowerstore

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class FlowerBuy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flower_buy)

        val btn = findViewById<ImageButton>(R.id.buy)
        val btnTxt = findViewById<TextView>(R.id.buyText)

        fun onNextClick(){
            var i = Intent(this, Payment::class.java)
            startActivity(i)
        }

        btn.setOnClickListener {
            onNextClick()
        }
        btnTxt.setOnClickListener {
            onNextClick()
        }
    }
}
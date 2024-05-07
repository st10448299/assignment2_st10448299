package com.example.assignment2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next= findViewById<Button>(R.id.btn_GetStarted)
        next.setOnClickListener{
            val intent = Intent(this@MainActivity,interaction_padge::class.java)
            startActivity(intent)


        }
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageResource = R.drawable.bolt_eating

        button.setOnClickListener {
            imageView.setImageResource(imageResource)
        }
    }
}
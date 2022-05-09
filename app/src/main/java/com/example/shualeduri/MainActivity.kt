package com.example.shualeduri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText1 = findViewById<EditText>(R.id.EnterName)
        val button1 = findViewById<ImageButton>(R.id.imageButton2)
        val button2 = findViewById<ImageView>(R.id.imageView)

        button1.setOnClickListener {
            val name = editText1.text.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("name",name)
            startActivity(intent)

        }
        button2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)

        }
    }
}
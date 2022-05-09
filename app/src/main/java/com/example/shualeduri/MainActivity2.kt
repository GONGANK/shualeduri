package com.example.shualeduri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //go-back button
        val button3 = findViewById<ImageButton>(R.id.imageButton3)
        button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)

        }

        findViewById<TextView>(R.id.EnterName2).text = intent.extras?.getString("name", "")

    }
}
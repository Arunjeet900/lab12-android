package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class addpage : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addpage)

        val savebtn = findViewById(R.id.saveBtn) as Button

        savebtn.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}

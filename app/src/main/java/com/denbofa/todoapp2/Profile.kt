package com.denbofa.todoapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Profile : AppCompatActivity() {

    private lateinit var preButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        preButton = findViewById(R.id.previous)

        preButton.setOnClickListener(){
            val intent: Intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }


    }
}
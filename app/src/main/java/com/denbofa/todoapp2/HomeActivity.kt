package com.denbofa.todoapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    private lateinit var profileClick: Button
    private lateinit  var aboutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.userNameDisplay)
        usernameDisplay.text = intent.getStringExtra("name")
        profileClick = findViewById(R.id.profileButton)
        aboutButton = findViewById(R.id.about)

        profileClick.setOnClickListener(){
            val intent: Intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        aboutButton.setOnClickListener(){
            val intent: Intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
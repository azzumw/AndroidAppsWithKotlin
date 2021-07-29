package com.example.andriod.exercise2_04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val welcomeText = findViewById<TextView>(R.id.welcome_text)

        intent?.let {
            val fullName = it.getStringExtra(FULL_NAME_KEY)


            welcomeText.text = getString(R.string.welcome_text,fullName)


        }
    }
}
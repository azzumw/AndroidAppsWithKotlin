package com.example.andriod.exercise2_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


const val FULL_NAME_KEY = "FULL_NAME_KEY"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitbtn = findViewById<Button>(R.id.submit_button)



        submitbtn.setOnClickListener {

            val fullname = findViewById<TextView>(R.id.fullname).text.toString().trim()
            if(fullname.isNotEmpty()){
                Intent(this,WelcomeActivity::class.java).also {

                    it.putExtra(FULL_NAME_KEY,fullname)

                    startActivity(it)
                }
            } else{
                Toast.makeText(this,getString(R.string.full_name_label),Toast.LENGTH_LONG).show()
            }
        }

    }
}
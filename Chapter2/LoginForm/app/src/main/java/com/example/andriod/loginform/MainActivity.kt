package com.example.andriod.loginform

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible


const val USERNAME_KEY = "user_key"
const val PASS_KEY = "pass_key"
class MainActivity : AppCompatActivity() {
    private lateinit var  usernameField : EditText
    private lateinit var  passwordField : EditText
    private lateinit var button :Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameField = findViewById(R.id.edit_username)
        passwordField= findViewById(R.id.edit_password)
        button = findViewById(R.id.submit_button)

        button.setOnClickListener {
            if(usernameField.text.trim().isNotEmpty() && passwordField.text.trim().isNotEmpty()){
                //process intent
                val user = usernameField.text.trim()
                val pass = passwordField.text.trim()
                Intent(this,MainActivity::class.java).also {
                    it.putExtra(USERNAME_KEY,user)
                    it.putExtra(PASS_KEY,pass)
                    startActivity(it)
                }

            }else {
                Toast.makeText(this,"fill in the fields man",Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onNewIntent(newIntent: Intent?) {
        super.onNewIntent(newIntent)

        Log.e(this.localClassName,"NewIntent")


        intent = newIntent



        intent?.let {
            val username = it.getStringExtra(USERNAME_KEY) ?: ""
            val pass = it.getStringExtra(PASS_KEY) ?: ""

            if(username==getString(R.string.username)&&
                pass==getString(R.string.password)){

                val welcometext = findViewById<TextView>(R.id.welcome_text)
                usernameField.isVisible.and(passwordField.isVisible).and(button.isVisible).also { false }

                welcometext.text = getString(R.string.welcome_msg,username)
                welcometext.isVisible = true

            }else{
                Toast.makeText(this,"Wrong credentials",Toast.LENGTH_LONG).show()
            }
        }


    }
}
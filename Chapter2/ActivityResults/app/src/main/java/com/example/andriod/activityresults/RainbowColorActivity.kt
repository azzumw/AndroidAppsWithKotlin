package com.example.andriod.activityresults

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RainbowColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rainbow_color)

        val colorPickerClickListener = View.OnClickListener {
            view ->
            when(view.id){
                R.id.red_btn -> setRainbowColor(getString(R.string.red),R.color.red)
                R.id.orange_btn -> setRainbowColor(getString(R.string.orange),R.color.orange)
                R.id.yellow_btn -> setRainbowColor(getString(R.string.yellow),R.color.yellow)
                R.id.green_btn -> setRainbowColor(getString(R.string.green),R.color.green)
                R.id.blue_btn -> setRainbowColor(getString(R.string.blue),R.color.blue)
                R.id.indigo_btn -> setRainbowColor(getString(R.string.indigo),R.color.indigo)
                R.id.violet_btn -> setRainbowColor(getString(R.string.violet),R.color.violet)
            }
        }

        findViewById<Button>(R.id.red_btn).setOnClickListener (colorPickerClickListener )
        findViewById<Button>(R.id.orange_btn).setOnClickListener (colorPickerClickListener )
        findViewById<Button>(R.id.yellow_btn).setOnClickListener(colorPickerClickListener)
        findViewById<Button>(R.id.green_btn).setOnClickListener(colorPickerClickListener)
        findViewById<Button>(R.id.blue_btn).setOnClickListener(colorPickerClickListener)
        findViewById<Button>(R.id.indigo_btn).setOnClickListener(colorPickerClickListener)
        findViewById<Button>(R.id.violet_btn).setOnClickListener (colorPickerClickListener )
    }

    private fun setRainbowColor(colorName:String,color:Int){
        Intent().let {
            pickedcolorIntent ->
            pickedcolorIntent.putExtra(RAINBOW_COLOR_NAME,colorName)

            pickedcolorIntent.putExtra(RAINBOW_COLOR,color)

            setResult(Activity.RESULT_OK,pickedcolorIntent)
            finish()

        }
    }
}
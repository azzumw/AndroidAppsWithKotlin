package com.example.andriod.exercise3_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


const val ON_CREATE = "OnCreate"
const val ON_START = "OnStart"
const val ON_RESUME = "OnResume"
const val ON_PAUSE = "OnPause"
const val ON_STOP = "OnStop"
const val ON_SAVE_INST = "OnSaveInstanceState"
const val ON_RESTART = "OnRestart"
const val ON_DESTROY = "OnDestroy"

class MainActivity : AppCompatActivity() {

    private val TAG = this.javaClass.canonicalName.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, ON_CREATE)
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, ON_START)
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, ON_RESUME)
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, ON_PAUSE)
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, ON_STOP)
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, ON_RESTART)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, ON_DESTROY)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e(TAG, ON_SAVE_INST)
    }
}
package com.example.andriod.exercise3_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


const val STAR_SIGN_ID = "STAR_SIGN_ID"
class MainActivity : AppCompatActivity(), StarSignListener{

    var isDualPane  = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        isDualPane =  findViewById<View>(R.id.starsigndetail) !=null
    }

    override fun onSelected(id: Int) {
        if (isDualPane){
            val detailFragment = supportFragmentManager.findFragmentById(R.id.starsigndetail) as DetailFragment
            detailFragment.setStarSignData(id)
        }else{
            val  detailIntent = Intent(this,DetailActivity::class.java).apply {
                putExtra(STAR_SIGN_ID,id)
            }

            startActivity(detailIntent)
        }
    }
}
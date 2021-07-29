package com.example.andriod.exercise3_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val starSignId = intent?.extras?.getInt(STAR_SIGN_ID,0) ?: 0

        val  detailFragment = supportFragmentManager.findFragmentById(R.id.starsigndetail) as DetailFragment

        detailFragment.setStarSignData(starSignId)
    }
}
package com.whatsnew.androidx.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whatsnew.androidx.R

class NewsFeedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_feed)
    }
}

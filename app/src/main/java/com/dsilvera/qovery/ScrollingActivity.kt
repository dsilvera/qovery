package com.dsilvera.qovery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scrolling.*
import kotlinx.android.synthetic.main.content_scrolling.*

class ScrollingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)

        homeAppBarLayout.addOnOffsetChangedListener(HomeHeaderOffsetChangedListener(homeButtonLayout, homeHeaderLayout))

    }
}
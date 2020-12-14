package com.dsilvera.qovery

import android.view.View
import com.google.android.material.appbar.AppBarLayout

class HomeHeaderOffsetChangedListener(private val headerLayout: View, private val buttonLayout: View) :
    AppBarLayout.OnOffsetChangedListener {
    private var oldVerticalOffset = -1
    override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
        if (oldVerticalOffset == verticalOffset) return
        oldVerticalOffset = verticalOffset
        val offsetFactor = 1f - ((-verticalOffset).toFloat() / appBarLayout.totalScrollRange.toFloat())
        headerLayout.alpha = offsetFactor
        buttonLayout.alpha = offsetFactor
    }
}
package com.pluu.layoutdepthcheck.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.pluu.layoutdepthcheck.R
import com.pluu.layoutdepthcheck.util.getDepthInfo

class NormalSampleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    init {
        inflate(context, R.layout.widget_normal_sample, this)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        val tvIcon = findViewById<View>(R.id.ivIcon)
        findViewById<TextView>(R.id.tvDepth).text = tvIcon.getDepthInfo()
    }
}
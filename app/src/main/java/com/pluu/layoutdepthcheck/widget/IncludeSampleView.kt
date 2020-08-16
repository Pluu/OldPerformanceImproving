package com.pluu.layoutdepthcheck.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.pluu.layoutdepthcheck.databinding.WidgetIncludeSampleBinding
import com.pluu.layoutdepthcheck.getDepthInfo

class IncludeSampleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = WidgetIncludeSampleBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        binding.tvTitle.text = "Include Title"
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        binding.tvSubtitle.text = binding.ivIcon.getDepthInfo()
    }
}
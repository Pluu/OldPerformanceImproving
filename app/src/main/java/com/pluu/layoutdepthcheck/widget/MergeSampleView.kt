package com.pluu.layoutdepthcheck.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.setPadding
import com.pluu.layoutdepthcheck.databinding.WidgetMergeSampleBinding
import com.pluu.layoutdepthcheck.getDepthInfo

class MergeSampleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = WidgetMergeSampleBinding.inflate(LayoutInflater.from(context), this)

    init {
        setPadding(25)
        binding.tvTitle.text = "Merge Title"
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        binding.tvSubtitle.text = binding.ivIcon.getDepthInfo()
    }
}
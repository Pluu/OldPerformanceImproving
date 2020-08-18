package com.pluu.layoutdepthcheck

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pluu.layoutdepthcheck.databinding.ActivityGpuOverdrawBinding
import com.pluu.util.resolveAttribute
import com.pluu.util.viewbinding.viewBinding

class GpuOverdrawActivity : AppCompatActivity(R.layout.activity_gpu_overdraw) {

    private val binding by viewBinding(ActivityGpuOverdrawBinding::bind)

    private val tag = GpuOverdrawActivity::class.java.simpleName

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val value = resolveAttribute(android.R.attr.windowBackground)
//        binding.tvWindowAttribute.text = "windowBackground=#${"%x".format(value.data).toUpperCase()}"
    }
}
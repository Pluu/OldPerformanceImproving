package com.pluu.layoutdepthcheck.util

import android.view.View
import android.widget.FrameLayout

@Suppress("NOTHING_TO_INLINE")
inline fun <T : View> T.getDepthInfo(): String {
    val depthView = mutableListOf(this.javaClass.simpleName)

    var _parent = parent
    while (_parent != null && !(_parent is FrameLayout && _parent.id == android.R.id.content)) {
        depthView.add(_parent.javaClass.simpleName)
        _parent = _parent.parent
    }
    return depthView.joinToString(separator = System.lineSeparator() + " > ")
}
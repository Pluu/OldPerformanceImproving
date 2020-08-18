package com.pluu.util

import android.content.Context
import android.util.TypedValue
import androidx.annotation.AttrRes

fun Context.resolveAttribute(@AttrRes attributeResId: Int): TypedValue {
    val typedValue = TypedValue()
    if (theme.resolveAttribute(attributeResId, typedValue, true)) {
        return typedValue
    }
    throw IllegalArgumentException(resources.getResourceName(attributeResId))
}
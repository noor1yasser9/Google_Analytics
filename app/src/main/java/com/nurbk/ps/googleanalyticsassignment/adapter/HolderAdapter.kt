package com.nurbk.ps.googleanalyticsassignment.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object HolderAdapter {

    @JvmStatic
    @BindingAdapter("image")
    fun image(view: ImageView, path: Int) {
        view.setImageResource(path)
    }

}
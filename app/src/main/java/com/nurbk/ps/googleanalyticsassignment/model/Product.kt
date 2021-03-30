package com.nurbk.ps.googleanalyticsassignment.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(
    val id: String, val idCategories: String, val name: String,
    val disc: String, val rating: Float, val pathImage: Int, var price: Int = 40
) : Parcelable
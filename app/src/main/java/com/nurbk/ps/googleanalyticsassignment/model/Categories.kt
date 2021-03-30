package com.nurbk.ps.googleanalyticsassignment.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Categories(val id: String, val name: String, val pathImage: Int) : Parcelable
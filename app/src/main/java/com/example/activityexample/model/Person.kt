package com.example.activityexample.model

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val name  : String,
    @DrawableRes
    val imgResDrawable: Int,
    val jobDesc : String,
    val shortDesc : String
) : Parcelable

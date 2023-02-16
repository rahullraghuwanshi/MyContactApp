package com.rahulraghuwanshi.mycontactapp.data.contact

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(
    val full_name: String = "",
    val country_code: String = "",
    val number: String = ""
) : Parcelable
package com.example.oksiutarecipe.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TokenModel(
    val token: String
):Parcelable

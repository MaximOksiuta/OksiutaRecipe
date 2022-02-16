package com.example.oksiutarecipe.utils

import androidx.annotation.IdRes

interface NavigatorController {
    fun showController()
    fun goneController()
    fun navigateTo(@IdRes id: Int)
}
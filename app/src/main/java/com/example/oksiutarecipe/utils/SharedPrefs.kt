package com.example.oksiutarecipe.utils

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

class SharedPrefs(context: Context) {
    companion object{
        private const val PREFS_KEY = "PREFS_KEY"
        private const val TOKEN_PREF_KEY = "TOKEN_PREF_KEY"
    }

    private val sharedPrefs: SharedPreferences = context.getSharedPreferences(PREFS_KEY, Context.MODE_PRIVATE)

    var token: String
    get() = sharedPrefs.getString(TOKEN_PREF_KEY, "")?: ""
    set(value) { sharedPrefs.edit { putString(TOKEN_PREF_KEY, value) } }
}
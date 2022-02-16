package com.example.oksiutarecipe.utils

import android.app.Application

val sharedPrefs by lazy {
    SharedPrefs(App.instance)
}

class App: Application() {
    companion object{
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
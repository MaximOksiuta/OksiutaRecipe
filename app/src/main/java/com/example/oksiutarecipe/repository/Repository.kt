package com.example.oksiutarecipe.repository

import android.widget.Toast
import com.example.oksiutarecipe.api.RetrofitInstance
import com.example.oksiutarecipe.models.Feed
import com.example.oksiutarecipe.models.SignUpResponse
import com.example.oksiutarecipe.models.TokenModel
import retrofit2.Response

class Repository {

    suspend fun signIn(email: String, password: String):Response<TokenModel>{
        return RetrofitInstance.api.signIn(email, password)
    }

    suspend fun signUp(email: String, name: String, password: String): Response<SignUpResponse>{
        return RetrofitInstance.api.signUp(email, name, password)
    }

    suspend fun myFeed(token: String): Response<List<Feed>>{

        return RetrofitInstance.api.myFeed(token)
    }
}
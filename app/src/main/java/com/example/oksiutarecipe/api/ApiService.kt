package com.example.oksiutarecipe.api

import com.example.oksiutarecipe.models.Feed
import com.example.oksiutarecipe.models.SignUpResponse
import com.example.oksiutarecipe.models.TokenModel
import retrofit2.Response
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @POST("signin")
    suspend fun signIn(@Header("email") email: String, @Header("password") password: String): Response<TokenModel>

    @POST("signup")
    suspend fun signUp(@Header("email") email: String,@Header("name") name: String, @Header("password") password: String ): Response<SignUpResponse>

    @POST("myfeed")
    suspend fun myFeed(@Query("token") token: String): Response<List<Feed>>

}
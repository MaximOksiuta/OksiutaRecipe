package com.example.oksiutarecipe.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.oksiutarecipe.models.SignUpResponse
import com.example.oksiutarecipe.models.TokenModel
import com.example.oksiutarecipe.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel: ViewModel() {
    companion object{
        private val repository = Repository()
    }

    val tokenResponse: MutableLiveData<Response<TokenModel>> = MutableLiveData()
    val signUpResponse: MutableLiveData<Response<SignUpResponse>> = MutableLiveData()
    fun signInSend(email: String, password: String){
        viewModelScope.launch {
            tokenResponse.value = repository.signIn(email, password)
        }
    }

    fun signUpSend(email: String, name: String, password: String){
        viewModelScope.launch {
            signUpResponse.value = repository.signUp(email, name, password)
        }
    }

    fun getFeeds(){
        viewModelScope.launch {

        }
    }
}
package com.example.oksiutarecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.oksiutarecipe.databinding.ActivitySignInBinding
import com.example.oksiutarecipe.utils.sharedPrefs
import com.example.oksiutarecipe.viewModels.MainViewModel

class SignIn : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignIn.setOnClickListener {
//            viewModel.signInSend(binding.etAccount.text.toString(), binding.etPassword.toString())
//            viewModel.tokenResponse.observe(this){resoponse ->
//                if (resoponse.isSuccessful){
//                    resoponse.body()?.token?.let { sharedPrefs.token = it }
//                    val intent = Intent(this, MainActivity::class.java)
//                    startActivity(intent)
//                } else{
//                    makeToast("Error ${resoponse.code()} ${resoponse.body()}")
//                }
//            }
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
        binding.btnGoToSignUp.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }

    private fun makeToast(text: String){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
package com.example.oksiutarecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.oksiutarecipe.databinding.ActivitySignUpBinding
import com.example.oksiutarecipe.viewModels.MainViewModel

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }
        binding.btnSignUp.setOnClickListener {
//            viewModel.signUpSend(binding.etEmail.text.toString(), binding.etName.text.toString(), binding.etPassword.text.toString())
//            viewModel.signUpResponse.observe(this){response ->
//                if (response.isSuccessful){
//                    response.body()?.answer?.let { it1 -> makeToast(it1) }
//                    val intent = Intent(this, MainActivity::class.java)
//                    startActivity(intent)
//                } else{
//                    makeToast("Error ${response.code()}")
//                }
//            }
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun makeToast(text: String){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

}
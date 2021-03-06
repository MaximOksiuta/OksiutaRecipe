package com.example.oksiutarecipe.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.oksiutarecipe.R
import com.example.oksiutarecipe.databinding.Fragment2Binding

class Fragment2 : Fragment(R.layout.fragment_2) {
    private lateinit var binding: Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("Fragment2", "I'm started")
        binding = Fragment2Binding.inflate(layoutInflater)
        return binding.root
    }
}
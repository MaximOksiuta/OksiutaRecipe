package com.example.oksiutarecipe.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.oksiutarecipe.R
import com.example.oksiutarecipe.databinding.Fragment4Binding

class Fragment4:Fragment(R.layout.fragment_4) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = Fragment4Binding.inflate(inflater, container, false).also {
        it.btnNewFeed.setOnClickListener {
            findNavController().navigate(R.id.fragmentAddNewFeed2)
        }
        it.button.setOnClickListener {
            findNavController().navigate(R.id.fragmentMyFeeds)
        }
    }.root
}
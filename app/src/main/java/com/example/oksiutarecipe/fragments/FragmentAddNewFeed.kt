package com.example.oksiutarecipe.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.oksiutarecipe.R
import com.example.oksiutarecipe.databinding.FragmentAddNewFeedBinding

class FragmentAddNewFeed: Fragment(R.layout.fragment_add_new_feed) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = FragmentAddNewFeedBinding.inflate(inflater, container, false).root
}
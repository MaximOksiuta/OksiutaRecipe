package com.example.oksiutarecipe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.oksiutarecipe.databinding.ActivityMainBinding
import com.example.oksiutarecipe.utils.NavigatorController

class MainActivity : AppCompatActivity(), NavigatorController {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHost.navController
        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId){
                R.id.fragment1 -> {
                    navController.navigate(R.id.fragment1)
                    true
                }
                R.id.fragment2 -> {
                    navController.navigate(R.id.fragment2)
                    Log.d("MainActivity", "Start fragment2")
                    true
                }
                R.id.fragment3 -> {
                    navController.navigate(R.id.fragment3)
                    true
                }
                R.id.fragment4 -> {
                    navController.navigate(R.id.fragment4)
                    true
                }
                else -> false
            }
        }
    }

    override fun showController() {
        binding.bottomNavigationView.visibility = View.VISIBLE
    }

    override fun goneController() {
        binding.bottomNavigationView.visibility = View.GONE
    }

    override fun navigateTo(id: Int) {
        navController.navigate(id)
    }

}
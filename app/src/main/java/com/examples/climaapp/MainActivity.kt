package com.examples.climaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.examples.climaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        initElements()
    }

    private fun initElements(){

    }
}
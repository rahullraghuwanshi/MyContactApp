package com.rahulraghuwanshi.mycontactapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rahulraghuwanshi.mycontactapp.R
import com.rahulraghuwanshi.mycontactapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
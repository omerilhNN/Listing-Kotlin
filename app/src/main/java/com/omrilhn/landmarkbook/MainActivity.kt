package com.omrilhn.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omrilhn.landmarkbook.databinding.ActivityDetailsBinding
import com.omrilhn.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //Connect XML with code
        val view = binding.root//after initializing take result
        setContentView(view) //you can reach all the binding properties by that
    }
}
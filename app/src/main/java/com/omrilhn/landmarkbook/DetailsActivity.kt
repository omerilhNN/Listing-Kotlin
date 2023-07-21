package com.omrilhn.landmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.omrilhn.landmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater) //Connect XML with code
        val view = binding.root//after initializing take result
        setContentView(view) //you can reach all the binding properties by that

        val intent = intent
        val selectedEvent = intent.getSerializableExtra("event") as Events
        binding.partyName.text = selectedEvent.name
        binding.partyDetails.text = selectedEvent.name
        binding.partyImage.setImageResource(selectedEvent.image)

    }
}
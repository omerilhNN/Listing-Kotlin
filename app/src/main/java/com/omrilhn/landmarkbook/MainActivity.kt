package com.omrilhn.landmarkbook

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.omrilhn.landmarkbook.databinding.ActivityDetailsBinding
import com.omrilhn.landmarkbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var eventsList:  ArrayList<Events>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //Connect XML with code
        val view = binding.root//after initializing take result
        setContentView(view) //you can reach all the binding properties by that

        eventsList = ArrayList<Events>()


        val dumanConcert = Events("Duman"," at IF Armada",R.drawable.duman)
        val eventify = Events("EventifyLogo","EventifyApp",R.drawable.pp)

        val bitmap = Bitmap

        //Adding elements to the list
        eventsList.add(dumanConcert)
        eventsList.add(eventify)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val eventAdapter = EventAdapter(eventsList)//In order to use that 'eventsList' into the
        //EventAdapter
        binding.recyclerView.adapter = eventAdapter

        /*
        //Listview: scrollable and initializing with ArrayLists inefficient compared to RecyclerView

        //Listview uses Adapter: adapter connects layout & data

        //mapping for converting type of variable
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,eventsList.map { events -> events.name    })

        binding.listView.adapter = adapter
        binding.listView.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(MainActivity@this,DetailsActivity::class.java) //Send Data with Intent
            intent.putExtra("eventName",eventsList.get(position)) //Send eventName to the DetailsActivity from MainActivity
            startActivity(intent)
        }*/



    }
}
package com.omrilhn.landmarkbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.omrilhn.landmarkbook.databinding.RecyclerRowBinding

class EventAdapter(val eventList : ArrayList<Events>): RecyclerView.Adapter<EventAdapter.EventHolder>() {

    class EventHolder(val binding : RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventHolder {
        //First initializing attempts done in that codeblock
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return EventHolder(binding)
    }

    override fun onBindViewHolder(holder: EventHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = eventList.get(position).name

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("event",eventList.get(position))
            holder.itemView.context.startActivity(intent)


        }
    }

    override fun getItemCount(): Int {
        return eventList.size
    }
}
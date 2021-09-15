package com.example.mycyclingtracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val dataset :MutableList<String>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ItemAdapter.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_view,parent,false)
        return ItemAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset.get(position)
        holder.rideType.text = item
        //holder.view.setOnClickListener {
            //Toast.makeText(holder.view.context,"you clicked " + position, Toast.LENGTH_SHORT).show()

        }
    override fun getItemCount(): Int = dataset.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val rideType : TextView =
            itemView.findViewById(R.id.rideType)
        val view = itemView



    }


    }

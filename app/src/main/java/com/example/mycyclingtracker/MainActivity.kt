package com.example.mycyclingtracker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset  = mutableListOf("fifteen-miler","half-century","century","dual century")
        val  recyclerView = findViewById<RecyclerView>(R.id.homeList)
        val adapter = ItemAdapter(dataset)

         recyclerView.layoutManager = LinearLayoutManager(this)
         recyclerView.adapter = adapter


        //findViewById<EditText>(R.id.rideType).text.toString()
        findViewById<Button>(R.id.button2).setOnClickListener {
            //findViewById<EditText>(R.id.rideType).text.toString()
            val itemTextView = findViewById<EditText>(R.id.ride_Type).text.toString()
            dataset.add(itemTextView)
            adapter.notifyDataSetChanged()
        }



        }
    }

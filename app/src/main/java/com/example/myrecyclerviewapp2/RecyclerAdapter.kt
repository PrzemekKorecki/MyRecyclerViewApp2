package com.example.myrecyclerviewapp2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val context: Context): RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        return CustomViewHolder(layoutInflater.inflate(R.layout.row, parent, false))
    }

    override fun getItemCount(): Int {
        return 51
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
    }
}

class CustomViewHolder(view: View): RecyclerView.ViewHolder(view)
package com.example.androidjetpack.architecture.databinding.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.androidjetpack.R
import com.example.androidjetpack.databinding.ListItemMyAdapterBinding


class MyAdapter(private val myDataset: Array<String>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        //var textView: TextView = v.findViewById(R.id.textView)
        val binding: ListItemMyAdapterBinding? = DataBindingUtil.bind(v)
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_my_adapter, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // holder.textView.text = myDataset[position]
        holder.binding?.value = myDataset[position]
    }

    override fun getItemCount() = myDataset.size
}
package com.example.app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.app.databinding.ItemMainBinding
import com.example.app.model.MainData

class MainAdapter: ListAdapter<MainData, MainAdapter.MainViewHolder>(diffCallback) {

    inner class MainViewHolder(val binding: ItemMainBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(item: MainData){
            with(binding){
                tvRecipe.text = item.recipe
                tvDate.text = item.date
            }
        }
    }

    companion object{
        val diffCallback = object : DiffUtil.ItemCallback<MainData>() {
            override fun areItemsTheSame(oldItem: MainData, newItem: MainData): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: MainData, newItem: MainData): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}



package com.ramsay.memeapp.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ramsay.memeapp.R
import com.ramsay.memeapp.databinding.ItemLayoutBinding
import com.ramsay.memeapp.models.response.Meme

class MemeAdapter : RecyclerView.Adapter<MemeAdapter.MemeViewHolder>() {

 var memeList = mutableListOf<Meme>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemLayoutBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_layout, parent, false)
        return MemeViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MemeViewHolder, position: Int) {
        val meme = memeList[position]
        holder.getData(meme)
    }

    override fun getItemCount(): Int {
      return  memeList.size
    }

    inner class MemeViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun getData(meme: Meme) {
            Glide.with(binding.image).load(meme.url).into(binding.image)
        }
    }


}
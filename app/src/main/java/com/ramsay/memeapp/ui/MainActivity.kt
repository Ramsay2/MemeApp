package com.ramsay.memeapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ramsay.memeapp.databinding.ActivityMainBinding
import com.ramsay.memeapp.models.response.Meme
import com.ramsay.memeapp.models.viewModels.MemeViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var memeAdapter: MemeAdapter
    private lateinit var memeViewModel: MemeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        memeViewModel = MemeViewModel()
        setRecyclerview()
        getDataFromApi()
    }

    private fun setRecyclerview() {
        memeAdapter = MemeAdapter()
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
                // LinearLayoutManager(this)

        binding.recyclerview.adapter = memeAdapter
    }

    private fun getDataFromApi() {
        memeViewModel.getDataFromApi().observe(this, {
        memeAdapter.memeList = it as MutableList<Meme>
            memeAdapter.notifyDataSetChanged()
        })
    }
}
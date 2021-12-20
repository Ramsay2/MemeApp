package com.ramsay.memeapp.models.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ramsay.memeapp.models.response.ApiClient
import com.ramsay.memeapp.models.di.Network
import com.ramsay.memeapp.models.response.Meme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MemeViewModel : ViewModel() {

    private val apiClient = Network.provideApiService().create(ApiClient::class.java)

    private val liveDataMeme = MutableLiveData<List<Meme>>()

    fun getDataFromApi(): LiveData<List<Meme>> {
viewModelScope.launch {

}
        CoroutineScope(Dispatchers.IO).launch {
        liveDataMeme.postValue(apiClient.getMeme().data.memes)
        }
        return liveDataMeme
    }

}
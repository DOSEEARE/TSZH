package com.example.tsj.ui.file

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FileViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Новости"
    }
    val text: LiveData<String> = _text
}
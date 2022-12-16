package com.aytachuseynli.mvvmusage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel() {
    var result = MutableLiveData("0")
    var mrepo = MathRepository()

    fun add(number1Result: String,number2Result: String) {//Side effect
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mrepo.add(number1Result,number2Result)
        }

    }

    fun multiple(number1Result: String,number2Result: String) {
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mrepo.multiple(number1Result,number2Result)
        }

    }
}
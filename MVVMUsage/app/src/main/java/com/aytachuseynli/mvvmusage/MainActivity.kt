package com.aytachuseynli.mvvmusage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.aytachuseynli.mvvmusage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by  viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainActivity = this
        viewModel.result.observe(this){
            binding.result = it
                    }
    }
        fun add(number1Result: String,number2Result: String) {
           viewModel.add(number1Result,number2Result)
        }

        fun multiple(number1Result: String,number2Result: String) {
            viewModel.multiple(number1Result,number2Result)
        }


}
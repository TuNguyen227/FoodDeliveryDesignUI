package com.example.fooddelivery

import android.os.Bundle
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddelivery.databinding.RecycleviewBinding

class RecycleActivity : AppCompatActivity() {
    private lateinit var binding: RecycleviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding=DataBindingUtil.setContentView(this,R.layout.recycleview)

        
        val dataSet=Restaurant_DATA.getdata()
        val _adapter=adapter(dataSet)
        val layout=LinearLayoutManager(this)
        binding.rvRestaurant.layoutManager=layout


        binding.rvRestaurant.adapter=_adapter

    }
}
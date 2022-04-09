package com.example.fooddelivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.fooddelivery.databinding.OnboardingoneBinding

class onboarding : AppCompatActivity() {
    private lateinit var binding: OnboardingoneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding=DataBindingUtil.setContentView(this,R.layout.onboardingone)
        val button=binding.btn
        button.setOnClickListener {
            val intent= Intent(applicationContext,welcome::class.java)
            startActivity(intent)
            finish()
        }
    }
}
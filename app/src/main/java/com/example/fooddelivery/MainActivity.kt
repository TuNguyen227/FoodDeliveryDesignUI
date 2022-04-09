package com.example.fooddelivery

import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.databinding.DataBindingUtil
import com.example.fooddelivery.databinding.SplashBinding

class MainActivity : AppCompatActivity() {
    private lateinit var splashBinding: SplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        splashBinding=DataBindingUtil.setContentView(this,R.layout.splash)

        val intent= Intent(applicationContext,onboarding::class.java)
        val handler=Handler(mainLooper).postDelayed({
            startActivity(intent)
        },2000)
    }
}
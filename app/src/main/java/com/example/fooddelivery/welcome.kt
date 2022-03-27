package com.example.fooddelivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.fooddelivery.databinding.WelcomeBinding

class welcome : AppCompatActivity() {
    private lateinit var binding: WelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding=DataBindingUtil.setContentView(this,R.layout.welcome)
        val googlebtn=binding.customgooglebtn
        val fbbtn=binding.customfbbtn
        val anotherbtn=binding.customanotherbtn
        val skipbtn=binding.skipbtn

        googlebtn.setOnClickListener {
            Toast.makeText(applicationContext,"Sigining with google account",Toast.LENGTH_SHORT).show()
        }

        fbbtn.setOnClickListener {
            Toast.makeText(applicationContext,"Sigining with facebook account",Toast.LENGTH_SHORT).show()
        }

        anotherbtn.setOnClickListener {
            var intent= Intent(applicationContext,signin::class.java)
            startActivity(intent)
        }

        skipbtn.setOnClickListener {
            Toast.makeText(applicationContext,"Skipping ",Toast.LENGTH_SHORT).show()
        }
    }
}
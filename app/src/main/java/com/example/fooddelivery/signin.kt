package com.example.fooddelivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.signin)
        val User:user= user("ronaldo@gmail.com","123456")
        var user_mail=findViewById<TextView>(R.id.usernamesignin)
        var user_password=findViewById<TextView>(R.id.passwordsignin)
        var loginbtn=findViewById<Button>(R.id.login)
        loginbtn.setOnClickListener {
            if (user_mail?.text.toString()==User.mail && user_password?.text.toString()==User.password )
            {
                var intent= Intent(applicationContext,profile::class.java)
                intent.putExtra("email",user_mail.text.toString())
                startActivity(intent)
            }
        }

    }
}
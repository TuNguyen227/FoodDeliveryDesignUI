package com.example.fooddelivery

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.fooddelivery.databinding.SigninBinding

class signin : AppCompatActivity() {
    private lateinit var binding: SigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding=DataBindingUtil.setContentView(this,R.layout.signin)
        var signupbtn=binding.signupbtn
        var user_mail_edittext=binding.usernamesignin
        var user_password_edittext=binding.passwordsignin
        var user_mail: Editable? =user_mail_edittext.text
        var user_pass: Editable? =user_password_edittext.text
        var loginbtn=binding.login

        signupbtn.setOnClickListener {
            var intent=Intent(applicationContext,signup:: class.java)
            startActivity(intent)
        }

        loginbtn.setOnClickListener {
            var isAccountFound=Validators.checkaccountIsMatchData(user_mail.toString(),user_pass.toString())
            if (isAccountFound)
            {
                var intent=Intent(applicationContext,profile::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(applicationContext,"Wrong email or password",Toast.LENGTH_SHORT).show()
        }

    }
}
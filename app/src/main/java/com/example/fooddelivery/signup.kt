package com.example.fooddelivery

import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.fooddelivery.databinding.SignupBinding

class signup : AppCompatActivity() {
    private lateinit var binding: SignupBinding
    private lateinit var model: viewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding=DataBindingUtil.setContentView(this,R.layout.signup)
        model=ViewModelProvider(this).get(viewmodel::class.java)
        var editTextemail :EditText=binding.emailsignup
        var editTextname :EditText=binding.textname
        var editTextpass :EditText=binding.Password
        var editTextrepass :EditText =binding.repasswork
        var signupbtn=binding.buttonsign

        var signin=binding.button2

        signupbtn.setOnClickListener {
            var name : Editable?=editTextname.text
            var email: Editable? =editTextemail.text
            var pass:Editable?=editTextpass.text
            var repass:Editable?=editTextrepass.text
            model.checkemailandpass(name.toString(),email.toString(),pass.toString(),repass.toString())

        }

        signin.setOnClickListener {
            onBackPressed()
            Data.name?.let { it1 -> Log.d("a", it1) }
        }
        signup_success_listener()
        signup_error_listener()
    }

    private fun signup_success_listener()
    {
        model.success.observe(this){isSuccess ->
            if (isSuccess)
            {

                Toast.makeText(applicationContext,"Success",Toast.LENGTH_SHORT).show()
                Log.d("asdas",Data.mail.toString())
                var handle=Handler(mainLooper).postDelayed(
                    {
                        onBackPressed()
                    },1000)
            }

        }
    }

    private fun signup_error_listener()
    {
        model.error.observe(this){error->
            Toast.makeText(applicationContext,error,Toast.LENGTH_SHORT).show()

        }
    }

}


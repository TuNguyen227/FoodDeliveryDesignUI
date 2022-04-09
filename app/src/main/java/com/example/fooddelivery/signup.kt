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

    private lateinit var _signupmodel: signupModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding=DataBindingUtil.setContentView(this,R.layout.signup)

        _signupmodel=ViewModelProvider(this).get(signupModel::class.java)
        var editTextemail :EditText=binding.emailsignup
        var editTextname :EditText=binding.textname
        var editTextpass :EditText=binding.Password
        var editTextrepass :EditText =binding.repasswork
        var signupbtn=binding.buttonsign
        var name : Editable?=editTextname.text
        var email: Editable? =editTextemail.text
        var pass:Editable?=editTextpass.text
        var repass:Editable?=editTextrepass.text
        var signin=binding.button2

        signupbtn.setOnClickListener {
            Data.addtolist(user("asd","asd","asd"))
            Log.d("tag", Data.getList()?.size.toString())
            var isaccountvalid=_signupmodel.checkemailandpass(email.toString(),pass.toString(),repass.toString())
            if(isaccountvalid)
            {
                _signupmodel.signupAccount(email.toString(),pass.toString(),name.toString())
                Toast.makeText(applicationContext,"Success",Toast.LENGTH_SHORT).show()
                Log.d("tag", Data.getList()?.size.toString())
                Handler(mainLooper).postDelayed(
                    {
                     onBackPressed()
                    },1000)
            }
            else
                Toast.makeText(applicationContext,"Fail",Toast.LENGTH_SHORT).show()
        }

        signin.setOnClickListener {
            onBackPressed()
            }
        }
    }



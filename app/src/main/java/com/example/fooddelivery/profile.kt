package com.example.fooddelivery

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.fooddelivery.databinding.DialogBinding
import com.example.fooddelivery.databinding.ProfileBinding

class profile : AppCompatActivity() {
    private lateinit var binding: ProfileBinding
    private lateinit var dialogbinding:DialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding=DataBindingUtil.setContentView(this,R.layout.profile)
        var username=binding.profilename
        var useremail=binding.profilemail
        var signout=binding.signoutprofile
        var phone=binding.profilphone
        getName_Dialog(username,useremail,phone)
        signout.setOnClickListener{
            onBackPressed()
        }
    }

    fun getName_Dialog(username: TextView, usermail :TextView,phone:TextView)
    {

        val dialog=LayoutInflater.from(this).inflate(R.layout.dialog,null)
        val dialogbuilder=AlertDialog.Builder(this)
            .setView(dialog)
            .setTitle("YOUR PROFILE")

        var nameuser=dialog.findViewById<EditText>(R.id.namedialog)
        var phoneuser=dialog.findViewById<EditText>(R.id.phonedialog)
        var btn=dialog.findViewById<Button>(R.id.dialogokbtn)
        nameuser.setHint("Type your full name")
        phoneuser.setHint("Type your phone number")
        val mdialog=dialogbuilder.show()
        btn.setOnClickListener{
            Data.name=nameuser.text.toString()
            Data.phone=phoneuser.text.toString()
            username.setText(Data.name)
            phone.setText(Data.phone)
            usermail.setText(Data.mail)
            mdialog.dismiss()
        }


    }
}
package com.example.fooddelivery

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.profile)
        var username=findViewById<TextView>(R.id.profilename)
        var useremail=findViewById<TextView>(R.id.profilemail)
        var signout=findViewById<Button>(R.id.signoutprofile)
        var phone=findViewById<TextView>(R.id.profilphone)
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
            username.setText(nameuser.text.toString())
            phone.setText(phoneuser.text.toString())
            usermail.setText(intent.getStringExtra("email"))
            mdialog.dismiss()
        }


    }
}
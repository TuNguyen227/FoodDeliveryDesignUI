package com.example.fooddelivery


import android.util.Log
import android.widget.EditText
import androidx.lifecycle.ViewModel

class viewmodel : ViewModel() {

    fun checkemailandpass(email: String, password: String,repassword:String):Boolean
    {
        val isEmailvalid=Validators.isemailvalid(email)
        val isPassValid=Validators.ispasswordvalid(password,repassword)
        Log.d("test1", isEmailvalid.toString()+ " "+ isPassValid.toString())
        return isEmailvalid && isPassValid
    }
}
package com.example.fooddelivery

class Validators {
    companion object{
        fun isemailvalid(email:String):Boolean{
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        }

        fun ispasswordvalid(password:String,repassword:String) : Boolean{
            val ispasswordMatch= password == repassword
            val ispasswordmatchLength= password.length >8
            return ispasswordMatch && ispasswordmatchLength
        }

        fun checkaccountIsMatchData(email:String,password:String) : Boolean{
            val ismailmatch=email == Data.mail
            val ispasswordmatch= password ==Data.pass
            return ismailmatch && ispasswordmatch
        }
    }

}
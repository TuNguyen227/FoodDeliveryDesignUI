package com.example.fooddelivery

object Data {

    private var List= mutableListOf<user>()

    fun getList(): List<user> {
        return List
    }

    fun addtolist(user: user)
    {
        List.add(user)
    }
}
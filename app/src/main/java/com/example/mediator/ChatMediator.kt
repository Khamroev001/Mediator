package com.example.mediator

interface ChatMediator {
    fun sendMessage(msg: String?, user: User?)

    fun addUser(user: User?)
}
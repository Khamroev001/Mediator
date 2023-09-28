package com.example.mediator

class ChatMediatorImpl : ChatMediator{
    private val users: MutableList<User?>

    init {
        users = ArrayList()
    }

    override fun addUser(user: User?) {
        users.add(user)
    }

    override fun sendMessage(msg: String?, user: User?) {
        for (u in users) {
            //message should not be received by the user sending it
            if (u !== user) {
                u!!.receive(msg)
            }
        }
    }
}
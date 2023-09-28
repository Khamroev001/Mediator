package com.example.mediator

class UserImpl(med: ChatMediator?, name: String?) :
    User(med!!, name!!) {
    override fun send(msg: String?) {
        println(name + ": Sending Message=" + msg)
        mediator.sendMessage(msg, this)
    }

    override fun receive(msg: String?) {
        println(name + ": Received Message:" + msg)
    }
}
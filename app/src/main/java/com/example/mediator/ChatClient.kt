package com.example.mediator

object ChatClient {
    @JvmStatic
    fun main(args: Array<String>) {
        val mediator: ChatMediator = ChatMediatorImpl()
        val user1: User = UserImpl(mediator, "Pankaj")
        val user2: User = UserImpl(mediator, "Lisa")
        val user3: User = UserImpl(mediator, "Saurabh")
        val user4: User = UserImpl(mediator, "David")
        mediator.addUser(user1)
        mediator.addUser(user2)
        mediator.addUser(user3)
        mediator.addUser(user4)
        user1.send("Hi All")
    }
}
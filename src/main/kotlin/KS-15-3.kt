package org.example

interface Reading {
    fun read()
}

interface Writing {
    fun write()
}

interface Deleting {
    fun delMessage()
}

abstract class Members {
    abstract val name: String
    abstract val role: String
}

class Admin(override val name: String, override val role: String) : Members(), Reading, Writing, Deleting {
    override fun read() {
        println("${role} ${name} читатет все сообщения.")
    }

    override fun write() {
        println("${role} ${name} пишет любые сообщения.")
    }

    override fun delMessage() {
        println("${role} ${name} удаляет любые сообщения.")
    }
}

class User(override val name: String, override val role: String) : Members(), Reading, Writing {
    override fun read() {
        println("${role} ${name} читатет все сообщения.")
    }

    override fun write() {
        println("${role} ${name} пишет любые сообщения.")
    }
}

fun main() {
    val admin1 = Admin("Фёдор", "Администратор")
    val user1 = User("Пётр", "Пользователь")
    val user2 = User("Олег", "Пользователь")

    admin1.read()
    admin1.write()
    admin1.delMessage()

    user1.read()
    user1.write()

    user2.read()
    user2.write()
}
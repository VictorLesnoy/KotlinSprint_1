package org.example

data class ForumMember(
    val userId: Int,
    val userName: String,
)

data class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum {
    val members: MutableMap<Int, ForumMember> = mutableMapOf()
    val messages: MutableList<ForumMessage> = mutableListOf()
    var nextUserId: Int = 1

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(nextUserId++, userName)
        members[newUser.userId] = newUser
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        if (!members.containsKey(authorId)) {
            println("Ошибка: пользователя с ID $authorId не существует.")
            return null
        }

        val newMessage = ForumMessage(authorId, message)
        messages.add(newMessage)
        return newMessage
    }

    fun printThread() {
        if (messages.isEmpty()) {
            println("Нет сообщений.")
            return
        }

        for (message in messages) {
            val author = members[message.authorId]!!
            println("${author.userName}: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()
    val kuz = forum.createNewUser("Кузя")
    val muz = forum.createNewUser("Музя")

    println("Зарегистрированные пользователи:")
    println(kuz.userName)
    println(muz.userName)

    forum.createNewMessage(kuz.userId, "Первое от Кузи.")
    forum.createNewMessage(kuz.userId, "Второе от Кузи.")

    forum.createNewMessage(muz.userId, "Первое от Музи.")
    forum.createNewMessage(muz.userId, "Второе от Музи.")

    println("Лента сообщений:")
    forum.printThread()
}
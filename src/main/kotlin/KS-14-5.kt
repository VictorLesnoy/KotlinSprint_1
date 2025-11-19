package org.example

class Chat(
    private val messages: MutableList<Message> = mutableListOf(),
    private var nextId: Int = 1
) {
    fun addMessage(text: String, author: String) {
        val message = Message(id = nextId++, text = text, author = author)
        messages.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        if (messages.none { it.id == parentMessageId }) {
            println("Ошибка: сообщение с ID $parentMessageId не найдено.")
            return
        }
        val message = ChildMessage(
            id = nextId++,
            text = text,
            author = author,
            parentMessageId = parentMessageId
        )
        messages.add(message)
    }

    fun printChat() {
        if (messages.isEmpty()) {
            println("Чат пуст.")
            return
        }

        val threads = messages
            .filterIsInstance<ChildMessage>()
            .groupBy { it.parentMessageId }

        val normalMessages = messages
            .filter { it !is ChildMessage }
            .sortedBy { it.id }

        for (message in normalMessages) {
            println("${message.id} ${message.author}: ${message.text}")

            val replies = threads[message.id] ?: emptyList()
            replies.forEach { reply ->
                println("   → ${reply.author}: ${reply.text}")
            }
        }
    }
}

open class Message(
    val id: Int,
    val text: String,
    val author: String
)

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageId: Int
) : Message(id, text, author)

fun main() {
    val chat = Chat()

    chat.addMessage("Привет!", "Алиса")
    chat.addMessage("Привет, Алиса!", "Боб")
    chat.addThreadMessage("Как дела?", "Алиса", 2)
    chat.addThreadMessage("Всё ок!", "Боб", 2)
    chat.addMessage("Я тут новенький", "Вася")

    chat.printChat()
}
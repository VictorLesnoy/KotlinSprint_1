package org.example

fun main() {
    val roomKotlin = Room(
        cover = "картинка",
        title = "Котлинка",
        members = mutableListOf()
    )

    println("Обложка: ${roomKotlin.cover}")
    println("Название комнаты: ${roomKotlin.title}")
    println("Участники: ${roomKotlin.members.map { it.username }}")

    val newMemberName = newMember()

    if (newMemberName.isNullOrBlank()) {
        println("Ошибка: ник не может быть пустым.")
        return
    }

    val newStatus = newStatus() ?: Status.MIC_OFF
    val newMember = Member(newMemberName, newStatus)
    roomKotlin.members.add(newMember)

    println("Участник комнаты ${roomKotlin.title} с ником $newMemberName имеет статус '$newStatus'\n")

    println("Участники комнаты ${roomKotlin.title}: ")
    roomKotlin.members.forEach { println(it.username) }
}

class Room(
    val cover: String,
    val title: String,
    val members: MutableList<Member>
)

class Member(
    val username: String,
    var status: Status
) {
    override fun toString(): String = "$username (статус: $status)"
}

enum class Status {
    SPEAKING, // разговаривает
    MIC_OFF,  // микрофон выключен
    MUTED     // пользователь заглушен
}

fun newMember(): String? {
    println("Пользователя с каким ником добавить?")
    return readlnOrNull()?.trim()
}

fun newStatus(): Status? {
    println("Какой статус у пользователя? (разговаривает, микрофон выключен, пользователь заглушен)")

    val input = readlnOrNull()?.trim() ?: return null

    return when (input) {
        "разговаривает" -> Status.SPEAKING
        "микрофон выключен" -> Status.MIC_OFF
        "пользователь заглушен" -> Status.MUTED
        else -> {
            println("Неизвестный статус: '$input'. Допустимые значения: разговаривает, микрофон выключен, пользователь заглушен.")
            null
        }
    }
}
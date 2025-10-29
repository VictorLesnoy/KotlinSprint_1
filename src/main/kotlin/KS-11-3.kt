package org.example

fun main() {
    val roomKotlin = Room(
        cover = "картинка",
        title = "Котлинка",
        memberList = mutableListOf("One", "Crack", "Bucks"),
        status = "разговаривает",
    )

    println("Обложка: ${roomKotlin.cover}")
    println("Название комнаты: ${roomKotlin.title}")
    println("Участник: ${roomKotlin.memberList.get(2)}")
    println("Статус участника: ${roomKotlin.status}")

    val newMember = newMember().toString()
    roomKotlin.memberList.add(newMember)
    val newStatus = newStatus()

    println("Участник комнаты ${roomKotlin.title} с ником $newMember имеет статус '$newStatus'\n")

    println("Участники комнаты ${roomKotlin.title}: ")
    roomKotlin.memberList.forEach { println(it) }


}

class Room(
    val cover: String,
    val title: String,
    val memberList: MutableList<String> = mutableListOf("One", "Crack", "Bucks"),
    val status: String,
)

fun newMember(): String? {
    println("Пользователя с каким ником добавить?")
    return readlnOrNull()
}

fun newStatus(): String? {
    println("Какой статус у пользователя (“разговаривает”, “микрофон выключен”, “пользователь заглушен”)?")
    return readlnOrNull()
}
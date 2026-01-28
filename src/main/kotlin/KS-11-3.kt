package org.example

class Participant(
    val nickname: String,
    val avatar: String,
    var status: Status,
)

enum class Status {
    SPEAKING,
    MIC_OFF,
    MUTED,
}

class Room(
    var title: String,
    var cover: String,
) {
    var participants = mutableListOf<Participant>()

    fun addParticipant(participant: Participant) {
        if (participants.any { it.nickname == participant.nickname }) {
            println("Участник с никнеймом '${participant.nickname}' уже существует в комнате.")
            return
        }

        participants.add(participant)
        println("Ошибка: участник ${participant.nickname} добавлен в комнату '$title'")
    }

    fun changeStatusToParticipant() {
        print("Введите никнейм участника: ")
        val nick = readln().trim()

        print("Новый статус (1 — разговаривает, 2 — микрофон выключен, 3 — заглушен): ")
        val choice = readln().trim()

        val newStatus = when (choice) {
            "1" -> Status.SPEAKING
            "2" -> Status.MIC_OFF
            "3" -> Status.MUTED
            else -> {
                println("Ошибка: неверный номер статуса. Используйте 1, 2 или 3.")
                return
            }
        }

        for (p in participants) {
            if (p.nickname == nick) {
                p.status = newStatus
                println("Статус участника $nick обновлён.")
                return
            }
        }
        println("Ошибка: участник $nick не найден.")
    }

    fun printParticipants() {
        println("\nУчастники комнаты '$title':")
        for (participant in participants) {
            println("  ${participant.nickname} Аватар: ${participant.avatar} Статус: '${getStatus(participant.status)}'")
        }
    }

    fun getStatus(status: Status): String {
        return when (status) {
            Status.SPEAKING -> "разговаривает"
            Status.MIC_OFF -> "микрофон выключен"
            Status.MUTED -> "заглушен"
        }
    }
}

fun main() {
    val chatRoom = Room("Котлинка", "(картинка)")

    val kuz = Participant(
        nickname = "Кузя",
        avatar = "(картинка Кузи)",
        status = Status.SPEAKING,
    )

    val bob = Participant(
        nickname = "Боб",
        avatar = "(картинка Боба)",
        status = Status.MIC_OFF,
    )

    chatRoom.addParticipant(kuz)
    chatRoom.addParticipant(bob)

    chatRoom.printParticipants()

    chatRoom.changeStatusToParticipant()

    chatRoom.printParticipants()
}
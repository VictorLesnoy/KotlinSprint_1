package org.example

class PhoneBookContacts(
    _name: String,
    _number: String,
    _company: String? = null,
) {
    val name = _name
    val number = _number
    val company = _company

    fun printContact() {
        println(
            "-Имя: $name\n-Номер: $number\n-Компания: ${
                company ?: "<не указано>"

            }\n"
        )
    }
}

fun main() {
    val contacts = mutableListOf<PhoneBookContacts>()
    var newContact = ""
    do {
        println("Введите имя контакта: ")
        val name = readln()

        println("Введите номер телефона: ")
        val enterNumber = readln()
        var number: String? = null
        try {
            val rightNumber = enterNumber.toLong()
            number = rightNumber.toString()
        } catch (e: NumberFormatException) {
            println("Вы ввели не цифры! Ошибка: ${e::class.simpleName}")
        }

        if (number != null) {
            println("Введите название компании: ")
            val companyInput = readln()
            val company = if (companyInput.isEmpty()) null else companyInput

            val contact = PhoneBookContacts(name, number, company)
            contacts.add(contact)

            println("Вести еще одного абонента? (да/нет)")
            newContact = readln()
        } else {
            println("Контакт не добавлен из-за неправильного ввода номера телефона.")
        }
    } while (newContact.equals("да", ignoreCase = true))
    println("Контакты:")
    contacts.forEach { it.printContact() }
}
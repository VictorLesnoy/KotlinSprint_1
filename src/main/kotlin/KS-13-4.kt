package org.example

class PhoneContacts(
    _name: String,
    _number: Long,
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
    val contacts = mutableListOf<PhoneContacts>()
    var newContact = ""
    do {
        println("Введите имя контакта: ")
        val name = readln()

        println("Введите номер телефона: ")
        val number = readln().toLongOrNull()
        if (number == null) {
            println("Вы не ввели номер телефона. Запись не создана.")
            continue
        }

        println("Введите название компании: ")
        val companyInput = readln()
        val company = if (companyInput.isEmpty()) null else companyInput

        val contact = PhoneContacts(name, number, company)
        contacts.add(contact)

        println("Вести еще одного абонента? (да/нет)")
        newContact = readln()


    } while (newContact.equals("да", ignoreCase = true))
    println("Контакты:")
    contacts.forEach {it.printContact() }
}
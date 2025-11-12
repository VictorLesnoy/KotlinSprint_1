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
    val bob = PhoneContacts("Bob", 899948652452)
    val kate = PhoneContacts("Kate", 89004562387, "Pepsi")
    val torr = PhoneContacts("Torr", 89654865212, "null")
    val punk = PhoneContacts("Punk", 8494986552, null)
    val rob = PhoneContacts("Rob", 549498416, "BMW")

    val contacts = listOf(bob, kate, torr, punk, rob)

    println("Компании, которые есть в телефонной книге:")
    val companies = contacts
        .map { it.company }
        .filterNotNull()
        .distinct()
    companies.forEach { println("- $it") }
}
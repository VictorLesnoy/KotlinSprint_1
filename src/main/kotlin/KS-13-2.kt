package org.example

class Contacts(
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
                company ?:
                    "<не указано>"
                
            }\n"
        )
    }
}

fun main() {
    val bob = Contacts("Bob", 899948652452, null)
    val kate = Contacts("Kate", 89004562387)
    bob.printContact()
    kate.printContact()
}
package org.example

class Parcel(number: Int, location: String, counter: Int) {

    var number = number
    var location = location
        set(value) {
            if (value != field) {
                field = value
                counter++
                println("Посылка №$number прибыла в пункт $value. Счётчик $counter.")
            }
        }
    var counter = 0

}

fun main() {
    val parcel = Parcel(1, "Лесной", 0)
    parcel.location = "Екатеринбург"
    parcel.location = "Казань"
    parcel.location = "Москва"
}
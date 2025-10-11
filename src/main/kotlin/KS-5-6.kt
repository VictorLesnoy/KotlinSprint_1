package org.example

fun main() {
    println("Введите ваш вес (в килограммах):")
    val weight = readln().toDouble()
    println("Введите ваш рост (в сантиметрах):")
    val height = readln().toDouble()
    val imtN = weight / Math.pow((height/100), 2.0)
    val imt = "%.2f".format(imtN)

    when(imtN) {
        in 0.0..<18.5 -> println("ИМТ = $imt Недостаточная масса тела")
        in 18.5..<25.0 -> println("ИМТ = $imt Нормальная масса тела.")
        in 25.0..<30.0 -> println("ИМТ = $imt Избыточная масса тела.")
        else -> println("ИМТ = $imt Ожирение")
    }

}
package org.example

fun main() {
    println("Введите ваш вес (в килограммах):")
    val weight = readln().toDouble()
    println("Введите ваш рост (в сантиметрах):")
    val height = readln().toDouble()
    val imt = weight / Math.pow((height/100), 2.0)

    when(imt) {
        in 0.0..<18.5 -> println("Недостаточная масса тела")
        in 18.5..<25.0 -> println("Нормальная масса тела.")
        in 25.0..<30.0 -> println("Избыточная масса тела.")
        else -> println("Ожирение")
    }

}
package org.example

fun main() {
    println("Введите ваш вес (в килограммах):")
    val weight = readln().toDouble()
    println("Введите ваш рост (в сантиметрах):")
    val height = readln().toDouble()
    val imtCalculated = weight / Math.pow((height / METER), 2.0)
    val imt = "%.2f".format(imtCalculated)

    when(imtCalculated) {
        in ZERO..< UNDERWRIGHT -> println("ИМТ = $imt Недостаточная масса тела")
        in UNDERWRIGHT..< NORMALWEIGHT -> println("ИМТ = $imt Нормальная масса тела.")
        in NORMALWEIGHT..< EXCESSWEIGHT -> println("ИМТ = $imt Избыточная масса тела.")
        else -> println("ИМТ = $imt Ожирение")
    }

}
const val METER = 100
const val ZERO = 0.0
const val UNDERWRIGHT = 18.5
const val NORMALWEIGHT = 25.0
const val EXCESSWEIGHT = 30.0

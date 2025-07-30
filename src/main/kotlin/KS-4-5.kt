package org.example

fun main() {
    val withoutDamage = false
    val crew = 70
    val provisions = 60
    val wetherGood = true
    val result: Boolean = ((withoutDamage == WITHOUT_DAMAGE) &&
            (crew in 55.. 70) &&
            (provisions > 50) &&
            (wetherGood == WETHER_GOOD))
            ||
            (!(withoutDamage == WITHOUT_DAMAGE) &&
            (crew == 70) &&
            (provisions > 50) &&
            (wetherGood == WETHER_GOOD))
    println("Корабль может приступить к плаванию: $result")
}
const val WITHOUT_DAMAGE = true
const val WETHER_GOOD = true

package org.example

fun main() {
    val withoutDamage = false
    val crew = 70
    val provisions = 60
    val wetherGood = true
    val result: Boolean = ((withoutDamage == WITHOUT_DAMAGE) &&
            (crew in CREW_MIN.. CREW_MAX) &&
            (provisions > PROVISION_MIN) &&
            (wetherGood == WETHER_GOOD))
            ||
            (!(withoutDamage == WITHOUT_DAMAGE) &&
            (crew == CREW_MAX) &&
            (provisions > PROVISION_MIN) &&
            (wetherGood == WETHER_GOOD))
    println("Корабль может приступить к плаванию: $result")
}
const val WITHOUT_DAMAGE = true
const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_MIN = 50
const val WETHER_GOOD = true

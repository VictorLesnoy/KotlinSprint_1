package org.example

data class GalacticGuide(
    val somethingName: String,
    val somethingDescription: String,
    val somethingDate: String,
    val somethingDistance: Int,
)

fun main() {
    val galactic = GalacticGuide(
        "Alpha Centauri",
        "далёкая-далёкая галактика",
        "12/12/2025",
        105577,
    )
    println("Название галактики ${galactic.component1()}\nописание '${galactic.component2()}'\nобнаружена ${galactic.component3()}\nрасстояние до неё ${galactic.component4()} световых лет")
}
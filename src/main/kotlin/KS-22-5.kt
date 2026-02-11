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
    println("Название галактики ${galactic.somethingName}\nописание '${galactic.somethingDescription}'\nобнаружена ${galactic.somethingDate}\nрасстояние до неё ${galactic.somethingDistance} световых лет")
}
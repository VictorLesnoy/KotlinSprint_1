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
    val (name, description, date, distance) = galactic
    println("Название галактики $name\nописание '$description'\nобнаружена $date\nрасстояние до неё $distance световых лет")
}
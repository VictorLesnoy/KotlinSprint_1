package org.example

abstract class SpaceObjects(
    val name: String,
    val atmosphere: Boolean,
    val landing: Boolean,
) {
    override fun toString(): String {
        return name
    }
}

class Planet(
    name: String,
    atmosphere: Boolean,
    landing: Boolean,
) : SpaceObjects(name, atmosphere, landing){
    val satellites = mutableListOf<Sputnic>()

    fun addSatellite(satellite: Sputnic) {
        satellites.add(satellite)
    }

    fun showSatellites() {
        println("Спутники планеты $name:")
        satellites.forEach { println("  — $it") }
    }
}

class Sputnic(
    name: String,
    atmosphere: Boolean,
    landing: Boolean,
) : SpaceObjects(name, atmosphere, landing)

fun main() {
    val earth = Planet("Земля", true, true)
    val moon = Sputnic("Луна", false, true)
    val lelia = Sputnic("Леля", false, false)

    earth.addSatellite(moon)
    earth.addSatellite(lelia)

    earth.showSatellites()
}
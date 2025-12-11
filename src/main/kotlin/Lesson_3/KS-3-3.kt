package org.example.Lesson_3

fun main() {
    val variable = 4
    val multiString = """
        $variable x 1 = ${variable*1}
        $variable x 2 = ${variable*2}
        $variable x 3 = ${variable*3}
        $variable x 4 = ${variable*4}
        $variable x 5 = ${variable*5}
        $variable x 6 = ${variable*6}
        $variable x 7 = ${variable*7}
        $variable x 8 = ${variable*8}
        $variable x 9 = ${variable*9}
    """.trimIndent()
    println(multiString)
}
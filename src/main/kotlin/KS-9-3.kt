package org.example

fun main() {
    val eggsMilkButter = mutableListOf(2, 50, 15)

    println("В рецепте на одну порцию омлета понадобится следующее количество продуктов:")
    println("яйца ${eggsMilkButter[0]} шт")
    println("молоко ${eggsMilkButter[1]} мл")
    println("масло ${eggsMilkButter[2]} гр")

    println("Какое количество порций желаете приготовить?")
    val answer = readln().toInt()

    println("На $answer порций вам понадобится:")
    val recipe = eggsMilkButter.map {
        it * answer
    }
    println("яиц - ${recipe[0]} шт")
    println("молока - ${recipe[1]} мл")
    println("сливочного масла - ${recipe[2]} гр")

}
package org.example

class RecipeCategory(
    val categoryName: String,
    val categoryPicture: String,
    val recipes: List<Recipe>,
)

class Recipe(
    val pictureOfRecipe: String,
    val nameOfRecipe: String,
    val portions: Double,
    val ingridients: List<Ingridients>,
    val recipe: String,
)

class Ingridients(
    val nameOfIngridient: String,
    val quantity: Double,
    val unit: String,
)

fun main() {


}


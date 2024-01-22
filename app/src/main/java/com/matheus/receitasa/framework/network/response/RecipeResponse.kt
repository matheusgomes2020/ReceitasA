package com.matheus.receitasa.framework.network.response

import com.matheus.core.domain.model.Recipe

data class RecipeResponse(
    val uri: String,
    val label: String,
    val image: String,
    val totalTime: Int
)

fun RecipeResponse.toRecipeModel(): Recipe {
    return Recipe(
        label = this.label,
        imageUrl = this.image,
        time = this.totalTime.toString(),
        ingredientsQuantity = this.totalTime.toString()

    )
}

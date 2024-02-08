package com.matheus.testing.model

import com.matheus.core.domain.model.Recipe
class RecipeFactory {
    fun create(recipe: Recipe) = when (recipe) {
        Recipe.BakedPotatoSnack -> Recipe(
            "Baked Potato Snack",
"",            "0.0",
            "5"
        )
        Recipe.SweetPotatoCrisps -> Recipe(
            "Sweet potato crisps",
""    ,        "0",
            "5"
        )
    }

    sealed class Recipe {
        object BakedPotatoSnack : Recipe()
        object SweetPotatoCrisps : Recipe()
    }
}
package com.matheus.receitasa.framework.network.response

data class RecipeResponse(
    val id: String,
    val label: String,
    val image: String,
    val totalTime: Int
)

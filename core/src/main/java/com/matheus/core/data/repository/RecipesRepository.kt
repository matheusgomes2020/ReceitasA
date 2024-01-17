package com.matheus.core.data.repository

import androidx.paging.PagingSource
import com.matheus.core.domain.model.Recipe

interface RecipesRepository {

    fun getRecipes(query: String): PagingSource<Int, Recipe>

}
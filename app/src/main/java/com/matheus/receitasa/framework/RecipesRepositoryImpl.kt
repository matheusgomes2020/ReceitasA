package com.matheus.receitasa.framework

import androidx.paging.PagingSource
import com.matheus.core.data.repository.RecipesRemoteDataSource
import com.matheus.core.data.repository.RecipesRepository
import com.matheus.core.domain.model.Recipe
import com.matheus.receitasa.framework.network.response.DataWrapperResponse
import com.matheus.receitasa.framework.paging.RecipesPagingSource
import javax.inject.Inject

class RecipesRepositoryImpl @Inject constructor(
    private val remoteDataSource: RecipesRemoteDataSource<DataWrapperResponse>
) : RecipesRepository {
    override fun getRecipes(query: String): PagingSource<Int, Recipe> {
        return RecipesPagingSource(remoteDataSource, query)
    }
}
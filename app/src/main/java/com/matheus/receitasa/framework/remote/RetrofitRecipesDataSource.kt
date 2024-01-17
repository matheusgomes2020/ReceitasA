package com.matheus.receitasa.framework.remote

import com.matheus.core.data.repository.RecipesRemoteDataSource
import com.matheus.receitasa.framework.network.RecipesApi
import com.matheus.receitasa.framework.network.response.DataWrapperResponse
import javax.inject.Inject

class RetrofitRecipesDataSource @Inject constructor(
    private val recipesApi: RecipesApi
) : RecipesRemoteDataSource<DataWrapperResponse> {
    override suspend fun fetchRecipes(queries: Map<String, String>): DataWrapperResponse {
        return recipesApi.getRecipes(queries)
    }
}
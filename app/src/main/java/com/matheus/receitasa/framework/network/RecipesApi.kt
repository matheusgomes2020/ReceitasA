package com.matheus.receitasa.framework.network

import com.matheus.receitasa.framework.network.response.DataWrapperResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface RecipesApi {

    @GET("/search?")
    suspend fun getRecipes(
        @QueryMap
        queries: Map<String, String>
    ): DataWrapperResponse

}
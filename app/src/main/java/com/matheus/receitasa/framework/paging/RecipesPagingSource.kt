package com.matheus.receitasa.framework.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.matheus.core.data.repository.RecipesRemoteDataSource
import com.matheus.core.domain.model.Recipe
import com.matheus.receitasa.framework.network.response.DataWrapperResponse
import com.matheus.receitasa.framework.network.response.toRecipeModel

class RecipesPagingSource(
    private val remoteDataSource: RecipesRemoteDataSource<DataWrapperResponse>,
    private val query: String
) : PagingSource<Int, Recipe>() {


    @Suppress("TooGenericExceptionCaught")
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Recipe> {
        return try {
            val from = params.key ?: 1
            val to = from + LIMIT

            val queries = hashMapOf(
                "from" to from.toString(),
                "to" to to.toString()
            )

            if (query.isNotEmpty()) {
                queries["q"] = query
            }

            val response = remoteDataSource.fetchRecipes(queries)

            val responseFrom = response.from
            val totalRecipes = response.count

            LoadResult.Page(
                data = response.hits.map { it.recipe.toRecipeModel() },
                prevKey = responseFrom - LIMIT,
                nextKey = if (responseFrom < totalRecipes) {
                    responseFrom + LIMIT
                    //responseTo + LIMIT
                } else null
            )

        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }

    }

    override fun getRefreshKey(state: PagingState<Int, Recipe>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition( anchorPosition )
            anchorPage?.prevKey?.plus(LIMIT) ?: anchorPage?.nextKey?.minus(LIMIT)
        }
    }

    companion object {
        private const val LIMIT = 20
    }

}
package com.matheus.testing.pagingsource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.matheus.core.domain.model.Recipe

class PagingSourceFactory {

    fun create(recipes: List<Recipe>) = object: PagingSource<Int, Recipe>() {
        override fun getRefreshKey(state: PagingState<Int, Recipe>) = 1

        override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Recipe> {
            return LoadResult.Page(
                data = recipes,
                prevKey = null,
                nextKey = 20
            )
        }

    }

}
package com.matheus.core.usecase

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.matheus.core.data.repository.RecipesRepository
import com.matheus.core.domain.model.Recipe
import com.matheus.core.usecase.base.PagingUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface GetRecipesUseCase {
    operator fun invoke(params: GetRecipesParams): Flow<PagingData<Recipe>>

    data class GetRecipesParams(val query: String, val pagingConfig: PagingConfig)
}
class GetRecipesUseCaseImpl @Inject constructor(
    private val recipesRepository: RecipesRepository
) : PagingUseCase<GetRecipesUseCase.GetRecipesParams, Recipe>(),
GetRecipesUseCase{

    override fun createFlowObservable(params: GetRecipesUseCase.GetRecipesParams): Flow<PagingData<Recipe>> {
        val pagingSource = recipesRepository.getRecipes(params.query)
        return Pager(config = params.pagingConfig) {
            pagingSource
        }.flow
    }



}
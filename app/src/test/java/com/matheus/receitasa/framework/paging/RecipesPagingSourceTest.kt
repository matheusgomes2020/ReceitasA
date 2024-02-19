package com.matheus.receitasa.framework.paging

import androidx.paging.PagingConfig
import androidx.paging.PagingSource
import com.matheus.core.data.repository.RecipesRemoteDataSource
import com.matheus.core.data.repository.RecipesRepository
import com.matheus.core.usecase.GetRecipesUseCase
import com.matheus.core.usecase.GetRecipesUseCaseImpl
import com.matheus.receitasa.factory.response.DataWrapperResponseFactory
import com.matheus.receitasa.framework.network.response.DataWrapperResponse
import com.matheus.testing.MainCoroutineRule
import com.matheus.testing.model.RecipeFactory
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class RecipesPagingSourceTest {

    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()


    private lateinit var recipesPagingSource: RecipesPagingSource

    @Mock
    lateinit var remoteDataSource: RecipesRemoteDataSource<DataWrapperResponse>

    private val dataWrapperResponseFactory = DataWrapperResponseFactory()

    private val recipeFactory = RecipeFactory()

    @Before
    fun setUp() {
        recipesPagingSource = RecipesPagingSource(remoteDataSource, "potato")
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `should return success load result when load is called`() = runTest{
        // Arrange
        whenever(remoteDataSource.fetchRecipes(any()))
            .thenReturn(dataWrapperResponseFactory.create())

        // Act
        val result = recipesPagingSource.load(
            PagingSource.LoadParams.Refresh(
                null,
                loadSize = 2,
                false
            )
        )

        // Assert
        val expected = listOf(
            recipeFactory.create(RecipeFactory.Recipe.BakedPotatoSnack),
            recipeFactory.create(RecipeFactory.Recipe.SweetPotatoCrisps)
        )
        assertEquals(
            PagingSource.LoadResult.Page(
                data = expected,
                prevKey = null,
                nextKey = 20
            ),
            result
        )

    }

}
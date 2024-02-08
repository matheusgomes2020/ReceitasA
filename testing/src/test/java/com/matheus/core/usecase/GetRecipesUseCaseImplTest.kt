package com.matheus.core.usecase

import androidx.paging.PagingConfig
import androidx.paging.PagingSource
import com.matheus.core.data.repository.RecipesRepository
import com.matheus.testing.MainCoroutineRule
import com.matheus.testing.model.RecipeFactory
import com.matheus.testing.pagingsource.PagingSourceFactory
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
class GetRecipesUseCaseImplTest {

    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    @Mock
    lateinit var repository: RecipesRepository

    private lateinit var getRecipesUseCase: GetRecipesUseCase

    private val recipe = RecipeFactory().create(RecipeFactory.Recipe.SweetPotatoCrisps)

    private val fakePagingSource = PagingSourceFactory().create(listOf(recipe))
    @Before
    fun setUp() {
        getRecipesUseCase = GetRecipesUseCaseImpl(repository)
    }

    @ExperimentalCoroutinesApi
    @Test
    fun `should validate flow paging data creation when invoke is called`() =
        runTest{
            whenever(repository.getRecipes(""))
                .thenReturn(fakePagingSource)


            val result = getRecipesUseCase
                .invoke(GetRecipesUseCase.GetRecipesParams("", PagingConfig(20)))

            verify(repository).getRecipes("")

            assertNotNull(result.first())

        }


}
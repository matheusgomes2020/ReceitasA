package com.matheus.receitasa.framework.di

import com.matheus.core.data.repository.RecipesRemoteDataSource
import com.matheus.core.data.repository.RecipesRepository
import com.matheus.receitasa.framework.RecipesRepositoryImpl
import com.matheus.receitasa.framework.network.response.DataWrapperResponse
import com.matheus.receitasa.framework.remote.RetrofitRecipesDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindRecipesRepository(repository: RecipesRepositoryImpl) : RecipesRepository

    @Binds
    fun bindRemoteDataSource(
        dataSource: RetrofitRecipesDataSource
    ) : RecipesRemoteDataSource<DataWrapperResponse>

}
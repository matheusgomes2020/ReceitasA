package com.matheus.receitasa.framework.di

import com.matheus.core.usecase.GetRecipesUseCase
import com.matheus.core.usecase.GetRecipesUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {

    @Binds
    fun bindRecipesUseCase(useCase: GetRecipesUseCaseImpl): GetRecipesUseCase

}
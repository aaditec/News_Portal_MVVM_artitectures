package com.nitv.newsapp.di

import android.content.Context
import com.nitv.newsapp.data.local.NewsDao
import com.nitv.newsapp.data.local.NewsDatabase
import com.nitv.newsapp.network.api.ApiHelper
import com.nitv.newsapp.network.repository.INewsRepository
import com.nitv.newsapp.network.repository.NewsRepository
import dagger.Module
import dagger.Provides

import javax.inject.Singleton

@Module
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRepository(
        remoteDataSource: ApiHelper, localDataSource: NewsDao
    ) = NewsRepository(remoteDataSource, localDataSource)

    @Singleton
    @Provides
    fun provideINewsRepository(repository: NewsRepository): INewsRepository = repository
}
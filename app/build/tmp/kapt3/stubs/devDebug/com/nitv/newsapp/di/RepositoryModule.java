package com.nitv.newsapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/nitv/newsapp/di/RepositoryModule;", "", "()V", "provideINewsRepository", "Lcom/nitv/newsapp/network/repository/INewsRepository;", "repository", "Lcom/nitv/newsapp/network/repository/NewsRepository;", "provideRepository", "remoteDataSource", "Lcom/nitv/newsapp/network/api/ApiHelper;", "localDataSource", "Lcom/nitv/newsapp/data/local/NewsDao;", "app_devDebug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.nitv.newsapp.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.nitv.newsapp.network.repository.NewsRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.network.api.ApiHelper remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.data.local.NewsDao localDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.nitv.newsapp.network.repository.INewsRepository provideINewsRepository(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.network.repository.NewsRepository repository) {
        return null;
    }
}
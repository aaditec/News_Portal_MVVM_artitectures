package com.nitv.newsapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/nitv/newsapp/di/RepositoryModule;", "", "()V", "provideDatabase", "Lcom/nitv/newsapp/data/local/NewsDatabase;", "appContext", "Landroid/content/Context;", "provideINewsRepository", "Lcom/nitv/newsapp/network/repository/INewsRepository;", "repository", "Lcom/nitv/newsapp/network/repository/NewsRepository;", "provideNewsDao", "Lcom/nitv/newsapp/data/local/NewsDao;", "db", "provideRepository", "remoteDataSource", "Lcom/nitv/newsapp/network/api/ApiHelper;", "localDataSource", "app_devDebug"})
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
    public final com.nitv.newsapp.data.local.NewsDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.nitv.newsapp.data.local.NewsDao provideNewsDao(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.data.local.NewsDatabase db) {
        return null;
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
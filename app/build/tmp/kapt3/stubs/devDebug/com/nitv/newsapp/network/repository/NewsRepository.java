package com.nitv.newsapp.network.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00180\u0017H\u0016J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/nitv/newsapp/network/repository/NewsRepository;", "Lcom/nitv/newsapp/network/repository/INewsRepository;", "remoteDataSource", "Lcom/nitv/newsapp/network/api/ApiHelper;", "localDataSource", "Lcom/nitv/newsapp/data/local/NewsDao;", "(Lcom/nitv/newsapp/network/api/ApiHelper;Lcom/nitv/newsapp/data/local/NewsDao;)V", "deleteAllNews", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNews", "news", "Lcom/nitv/newsapp/data/model/NewsArticle;", "(Lcom/nitv/newsapp/data/model/NewsArticle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNews", "Lcom/nitv/newsapp/state/NetworkState;", "Lcom/nitv/newsapp/data/model/NewsResponse;", "countryCode", "", "pageNumber", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedNews", "Landroidx/lifecycle/LiveData;", "", "saveNews", "", "searchNews", "searchQuery", "app_devDebug"})
public final class NewsRepository implements com.nitv.newsapp.network.repository.INewsRepository {
    private final com.nitv.newsapp.network.api.ApiHelper remoteDataSource = null;
    private final com.nitv.newsapp.data.local.NewsDao localDataSource = null;
    
    @javax.inject.Inject()
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.network.api.ApiHelper remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.data.local.NewsDao localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveNews(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.data.model.NewsArticle news, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.nitv.newsapp.data.model.NewsArticle>> getSavedNews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteNews(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.data.model.NewsArticle news, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteAllNews(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}
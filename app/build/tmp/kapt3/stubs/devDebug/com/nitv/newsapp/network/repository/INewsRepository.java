package com.nitv.newsapp.network.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00130\u0012H&J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/nitv/newsapp/network/repository/INewsRepository;", "", "deleteAllNews", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNews", "news", "Lcom/nitv/newsapp/data/model/NewsArticle;", "(Lcom/nitv/newsapp/data/model/NewsArticle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNews", "Lcom/nitv/newsapp/state/NetworkState;", "Lcom/nitv/newsapp/data/model/NewsResponse;", "countryCode", "", "pageNumber", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedNews", "Landroidx/lifecycle/LiveData;", "", "saveNews", "", "searchNews", "searchQuery", "app_devDebug"})
public abstract interface INewsRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveNews(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.data.model.NewsArticle news, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.nitv.newsapp.data.model.NewsArticle>> getSavedNews();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteNews(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.data.model.NewsArticle news, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteAllNews(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
package com.nitv.newsapp.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/nitv/newsapp/network/api/ApiHelperImpl;", "Lcom/nitv/newsapp/network/api/ApiHelper;", "newsApi", "Lcom/nitv/newsapp/network/api/NewsApi;", "(Lcom/nitv/newsapp/network/api/NewsApi;)V", "getNewsApi", "()Lcom/nitv/newsapp/network/api/NewsApi;", "getNews", "Lretrofit2/Response;", "Lcom/nitv/newsapp/data/model/NewsResponse;", "countryCode", "", "pageNumber", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchNews", "query", "app_devDebug"})
public final class ApiHelperImpl implements com.nitv.newsapp.network.api.ApiHelper {
    @org.jetbrains.annotations.NotNull()
    private final com.nitv.newsapp.network.api.NewsApi newsApi = null;
    
    @javax.inject.Inject()
    public ApiHelperImpl(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.network.api.NewsApi newsApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nitv.newsapp.network.api.NewsApi getNewsApi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.nitv.newsapp.data.model.NewsResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int pageNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.nitv.newsapp.data.model.NewsResponse>> continuation) {
        return null;
    }
}
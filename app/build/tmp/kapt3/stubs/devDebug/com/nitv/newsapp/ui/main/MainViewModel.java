package com.nitv.newsapp.ui.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u00107\u001a\u000208J\u000e\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u000fJ\u000e\u0010;\u001a\u0002082\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u000208J\u000e\u0010?\u001a\u0002082\u0006\u0010@\u001a\u00020\nJ\u000e\u0010A\u001a\u00020\n2\u0006\u0010B\u001a\u00020\nJ\u0012\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0E0DJ\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0006\u0010I\u001a\u000208J\u0010\u0010J\u001a\u0002082\u0006\u0010K\u001a\u00020LH\u0002J\u000e\u0010M\u001a\u0002082\u0006\u0010<\u001a\u00020=J\u000e\u0010N\u001a\u0002082\u0006\u0010O\u001a\u00020\nR\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u000e\u0010#\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00128F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0014R\u001c\u0010/\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001a\u00a8\u0006P"}, d2 = {"Lcom/nitv/newsapp/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/nitv/newsapp/network/repository/INewsRepository;", "networkHelper", "Lcom/nitv/newsapp/utils/NetworkHelper;", "coroutinesDispatcherProvider", "Lcom/nitv/newsapp/di/CoroutinesDispatcherProvider;", "(Lcom/nitv/newsapp/network/repository/INewsRepository;Lcom/nitv/newsapp/utils/NetworkHelper;Lcom/nitv/newsapp/di/CoroutinesDispatcherProvider;)V", "TAG", "", "_errorMessage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_newsResponse", "Lcom/nitv/newsapp/state/NetworkState;", "Lcom/nitv/newsapp/data/model/NewsResponse;", "_searchNewsResponse", "errorMessage", "Lkotlinx/coroutines/flow/StateFlow;", "getErrorMessage", "()Lkotlinx/coroutines/flow/StateFlow;", "feedNewsPage", "", "getFeedNewsPage", "()I", "setFeedNewsPage", "(I)V", "feedResponse", "newQuery", "getNewQuery", "()Ljava/lang/String;", "setNewQuery", "(Ljava/lang/String;)V", "newsResponse", "getNewsResponse", "oldQuery", "searchEnable", "", "getSearchEnable", "()Z", "setSearchEnable", "(Z)V", "searchNewsPage", "getSearchNewsPage", "setSearchNewsPage", "searchNewsResponse", "getSearchNewsResponse", "searchResponse", "getSearchResponse", "()Lcom/nitv/newsapp/data/model/NewsResponse;", "setSearchResponse", "(Lcom/nitv/newsapp/data/model/NewsResponse;)V", "totalPage", "getTotalPage", "setTotalPage", "clearSearch", "", "convertPublishedDate", "currentResponse", "deleteNews", "news", "Lcom/nitv/newsapp/data/model/NewsArticle;", "enableSearch", "fetchNews", "countryCode", "formatDate", "strCurrentDate", "getFavoriteNews", "Landroidx/lifecycle/LiveData;", "", "handleFeedNewsResponse", "response", "handleSearchNewsResponse", "hideErrorToast", "onError", "throwable", "", "saveNews", "searchNews", "query", "app_devDebug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.nitv.newsapp.network.repository.INewsRepository repository = null;
    private final com.nitv.newsapp.utils.NetworkHelper networkHelper = null;
    private final com.nitv.newsapp.di.CoroutinesDispatcherProvider coroutinesDispatcherProvider = null;
    private final java.lang.String TAG = "MainViewModel";
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _errorMessage = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse>> _newsResponse = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse>> _searchNewsResponse = null;
    private com.nitv.newsapp.data.model.NewsResponse feedResponse;
    private int feedNewsPage = 1;
    private boolean searchEnable = false;
    private int searchNewsPage = 1;
    @org.jetbrains.annotations.Nullable()
    private com.nitv.newsapp.data.model.NewsResponse searchResponse;
    private java.lang.String oldQuery = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String newQuery = "";
    private int totalPage = 1;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.network.repository.INewsRepository repository, @org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.utils.NetworkHelper networkHelper, @org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.di.CoroutinesDispatcherProvider coroutinesDispatcherProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse>> getNewsResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse>> getSearchNewsResponse() {
        return null;
    }
    
    public final int getFeedNewsPage() {
        return 0;
    }
    
    public final void setFeedNewsPage(int p0) {
    }
    
    public final boolean getSearchEnable() {
        return false;
    }
    
    public final void setSearchEnable(boolean p0) {
    }
    
    public final int getSearchNewsPage() {
        return 0;
    }
    
    public final void setSearchNewsPage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.nitv.newsapp.data.model.NewsResponse getSearchResponse() {
        return null;
    }
    
    public final void setSearchResponse(@org.jetbrains.annotations.Nullable()
    com.nitv.newsapp.data.model.NewsResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNewQuery() {
        return null;
    }
    
    public final void setNewQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTotalPage() {
        return 0;
    }
    
    public final void setTotalPage(int p0) {
    }
    
    public final void fetchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
    }
    
    private final com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse> handleFeedNewsResponse(com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse> response) {
        return null;
    }
    
    public final void searchNews(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse> handleSearchNewsResponse(com.nitv.newsapp.state.NetworkState<com.nitv.newsapp.data.model.NewsResponse> response) {
        return null;
    }
    
    public final void convertPublishedDate(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.data.model.NewsResponse currentResponse) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatDate(@org.jetbrains.annotations.NotNull()
    java.lang.String strCurrentDate) {
        return null;
    }
    
    public final void hideErrorToast() {
    }
    
    public final void saveNews(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.data.model.NewsArticle news) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.nitv.newsapp.data.model.NewsArticle>> getFavoriteNews() {
        return null;
    }
    
    public final void deleteNews(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.data.model.NewsArticle news) {
    }
    
    public final void clearSearch() {
    }
    
    public final void enableSearch() {
    }
    
    private final void onError(java.lang.Throwable throwable) {
    }
}
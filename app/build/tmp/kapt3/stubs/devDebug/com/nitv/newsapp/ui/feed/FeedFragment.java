package com.nitv.newsapp.ui.feed;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\u0012\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010&\u001a\u00020\u001f2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\u001a\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010.\u001a\u00020\u0002H\u0016J\b\u0010/\u001a\u00020\u001fH\u0002J\b\u00100\u001a\u00020\u001fH\u0002J\b\u00101\u001a\u00020\u001fH\u0002J\u0010\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u0005H\u0002J\b\u00104\u001a\u00020\u001fH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u00065"}, d2 = {"Lcom/nitv/newsapp/ui/feed/FeedFragment;", "Lcom/nitv/newsapp/base/BaseFragment;", "Lcom/nitv/newsapp/databinding/FragmentFeedBinding;", "()V", "countryCode", "", "getCountryCode", "()Ljava/lang/String;", "mainViewModel", "Lcom/nitv/newsapp/ui/main/MainViewModel;", "getMainViewModel", "()Lcom/nitv/newsapp/ui/main/MainViewModel;", "setMainViewModel", "(Lcom/nitv/newsapp/ui/main/MainViewModel;)V", "newsAdapter", "Lcom/nitv/newsapp/ui/adapter/NewsAdapter;", "onScrollListener", "Lcom/nitv/newsapp/utils/EndlessRecyclerOnScrollListener;", "searchView", "Landroidx/appcompat/widget/SearchView;", "getSearchView", "()Landroidx/appcompat/widget/SearchView;", "setSearchView", "(Landroidx/appcompat/widget/SearchView;)V", "viewModelFactory", "Lcom/nitv/newsapp/di/Factory/ViewModelFactory;", "getViewModelFactory", "()Lcom/nitv/newsapp/di/Factory/ViewModelFactory;", "setViewModelFactory", "(Lcom/nitv/newsapp/di/Factory/ViewModelFactory;)V", "collectSearchResponse", "", "hideBottomPadding", "hideErrorMessage", "hideProgressBar", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onViewCreated", "view", "Landroid/view/View;", "setBinding", "setupObservers", "setupRecyclerView", "setupUI", "showErrorMessage", "message", "showProgressBar", "app_devDebug"})
public final class FeedFragment extends com.nitv.newsapp.base.BaseFragment<com.nitv.newsapp.databinding.FragmentFeedBinding> {
    private com.nitv.newsapp.utils.EndlessRecyclerOnScrollListener onScrollListener;
    public com.nitv.newsapp.ui.main.MainViewModel mainViewModel;
    @javax.inject.Inject()
    public com.nitv.newsapp.di.Factory.ViewModelFactory viewModelFactory;
    private com.nitv.newsapp.ui.adapter.NewsAdapter newsAdapter;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String countryCode = "in";
    public androidx.appcompat.widget.SearchView searchView;
    
    public FeedFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nitv.newsapp.databinding.FragmentFeedBinding setBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nitv.newsapp.ui.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.ui.main.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nitv.newsapp.di.Factory.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.di.Factory.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountryCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.SearchView getSearchView() {
        return null;
    }
    
    public final void setSearchView(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.SearchView p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupUI() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setupObservers() {
    }
    
    private final void collectSearchResponse() {
    }
    
    private final void showProgressBar() {
    }
    
    private final void hideProgressBar() {
    }
    
    private final void showErrorMessage(java.lang.String message) {
    }
    
    private final void hideErrorMessage() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    private final void hideBottomPadding() {
    }
}
package com.nitv.newsapp.ui.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006!"}, d2 = {"Lcom/nitv/newsapp/ui/favorite/FavoriteFragment;", "Lcom/nitv/newsapp/base/BaseFragment;", "Lcom/nitv/newsapp/databinding/FragmentFavoritesBinding;", "()V", "newsAdapter", "Lcom/nitv/newsapp/ui/adapter/NewsAdapter;", "getNewsAdapter", "()Lcom/nitv/newsapp/ui/adapter/NewsAdapter;", "setNewsAdapter", "(Lcom/nitv/newsapp/ui/adapter/NewsAdapter;)V", "viewModel", "Lcom/nitv/newsapp/ui/main/MainViewModel;", "getViewModel", "()Lcom/nitv/newsapp/ui/main/MainViewModel;", "setViewModel", "(Lcom/nitv/newsapp/ui/main/MainViewModel;)V", "viewModelFactory", "Lcom/nitv/newsapp/di/Factory/ViewModelFactory;", "getViewModelFactory", "()Lcom/nitv/newsapp/di/Factory/ViewModelFactory;", "setViewModelFactory", "(Lcom/nitv/newsapp/di/Factory/ViewModelFactory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "setBinding", "setupObserver", "setupRecyclerView", "setupUI", "app_devDebug"})
public final class FavoriteFragment extends com.nitv.newsapp.base.BaseFragment<com.nitv.newsapp.databinding.FragmentFavoritesBinding> {
    public com.nitv.newsapp.ui.main.MainViewModel viewModel;
    public com.nitv.newsapp.ui.adapter.NewsAdapter newsAdapter;
    @javax.inject.Inject()
    public com.nitv.newsapp.di.Factory.ViewModelFactory viewModelFactory;
    
    public FavoriteFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nitv.newsapp.databinding.FragmentFavoritesBinding setBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nitv.newsapp.ui.main.MainViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.ui.main.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nitv.newsapp.ui.adapter.NewsAdapter getNewsAdapter() {
        return null;
    }
    
    public final void setNewsAdapter(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.ui.adapter.NewsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nitv.newsapp.di.Factory.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.nitv.newsapp.di.Factory.ViewModelFactory p0) {
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
    
    private final void setupRecyclerView() {
    }
    
    private final void setupUI(android.view.View view) {
    }
    
    private final void setupObserver() {
    }
}
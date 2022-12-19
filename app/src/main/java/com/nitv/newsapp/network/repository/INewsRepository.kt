package com.nitv.newsapp.network.repository

import androidx.lifecycle.LiveData
import com.nitv.newsapp.data.model.NewsArticle
import com.nitv.newsapp.data.model.NewsResponse
import com.nitv.newsapp.state.NetworkState
interface INewsRepository{

    suspend fun getNews(countryCode: String, pageNumber: Int): NetworkState<NewsResponse>

    suspend fun searchNews(searchQuery: String, pageNumber: Int): NetworkState<NewsResponse>

    suspend fun saveNews(news: NewsArticle)

    fun getSavedNews(): LiveData<List<NewsArticle>>

    fun deleteNews(news: NewsArticle)

    fun deleteAllNews()
}

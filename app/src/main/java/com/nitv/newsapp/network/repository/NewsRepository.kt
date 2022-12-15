package com.nitv.newsapp.network.repository

import com.nitv.newsapp.data.local.NewsDao
import com.nitv.newsapp.data.model.NewsArticle
import com.nitv.newsapp.data.model.NewsResponse
import com.nitv.newsapp.network.api.ApiHelper
import com.nitv.newsapp.state.NetworkState
import javax.inject.Inject

class NewsRepository @Inject constructor(
    val remoteDataSource: ApiHelper,
     val localDataSource: NewsDao
) : INewsRepository {

    override suspend fun getNews(
        countryCode: String,
        pageNumber: Int
    ): NetworkState<NewsResponse> {
        return try {
            val response = remoteDataSource.getNews(countryCode, pageNumber)
            val result = response.body()
            if (response.isSuccessful && result != null) {
                NetworkState.Success(result)
            } else {
                NetworkState.Error("An error occurred")
            }
        } catch (e: Exception) {
            NetworkState.Error("Error occurred ${e.localizedMessage}")
        }
    }

    override suspend fun searchNews(
        searchQuery: String,
        pageNumber: Int
    ): NetworkState<NewsResponse> {
        return try {
            val response = remoteDataSource.searchNews(searchQuery, pageNumber)
            val result = response.body()
            if (response.isSuccessful && result != null) {
                NetworkState.Success(result)
            } else {
                NetworkState.Error("An error occurred")
            }
        } catch (e: Exception) {
            NetworkState.Error("Error occurred ${e.localizedMessage}")
        }
    }

    override suspend fun saveNews(news: NewsArticle) = localDataSource.upsert(news)

    override fun getSavedNews() = localDataSource.getAllNews()

    override fun deleteNews(news: NewsArticle) = localDataSource.deleteNews(news)

    override fun deleteAllNews() = localDataSource.deleteAllNews()
}
package com.nitv.newsapp.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.nitv.newsapp.data.model.NewsArticle

@Dao
interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun upsert(newsArticle: NewsArticle)

    @Query("SELECT * FROM news_articles")
    fun getAllNews(): LiveData<List<NewsArticle>>

    @Delete
    fun deleteNews(newsArticle: NewsArticle)

    @Query("Delete FROM news_articles")
    fun deleteAllNews()
}
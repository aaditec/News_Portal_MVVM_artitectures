package com.nitv.newsapp.data.model

import com.nitv.newsapp.data.model.NewsArticle


data class NewsResponse(
    val articles: MutableList<NewsArticle>,
    val status: String,
    val totalResults: Int
)
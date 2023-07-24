package com.example.newsappapi.Interface

import com.example.newsappapi.Modal.NewsModal
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/v2/everything")
    fun getNews(
        @Query("q") q:String,
        @Query("from") from: String,
        @Query("sortBy") sortBy:String,
        @Query("apiKey") apiKey:String
    ): Call<NewsModal>
}
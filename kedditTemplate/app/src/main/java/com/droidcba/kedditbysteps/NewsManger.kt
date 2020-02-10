package com.droidcba.kedditbysteps

import com.droidcba.kedditbysteps.api.NewsApi
import com.droidcba.kedditbysteps.model.RedditNews
import retrofit2.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NewsManger @Inject constructor(private val api:NewsApi) {

    suspend fun getNews(after:String, limit:String="10"):RedditNews{
        val result = api.getNews(after,limit)
    }
}
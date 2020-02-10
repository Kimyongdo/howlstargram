package com.droidcba.kedditbysteps.api

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton

interface NewsApi{
    //Call은 retrofit call 사용
    fun getNews(after:String,limit :String): Call<RedditNewsResponse>
}

interface RedditApi{
    @GET("./top.json")
    fun getTop(@Query("after") after:String,@Query("limit") limit: String
    ):Call<RedditNewsResponse>
}

//inject?
class NewsRestApi @Inject constructor(private val redditApi: RedditApi):NewsApi{
    override fun getNews(after: String, limit: String): Call<RedditNewsResponse> {
        return redditApi.getTop(after,limit)
    }//반환타입이 NewsApi

}

//dagger의 효과
@Module
class NetworkModule{
    @Provides
    @Singleton
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder()
                .baseUrl("https://www.retrofit.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
    }
}
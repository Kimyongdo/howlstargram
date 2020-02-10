package com.droidcba.kedditbysteps.api


//json을 해석할 클래스를 담을 곳
class RedditNewsResponse(val data: RedditDataResponse)

class RedditDataResponse(
        val children:List<RedditChildrenResponse>,
        val after:String?,
        val before:String
)

class RedditChildrenResponse(val data:RedditNewsDataReseponse)

class RedditNewsDataReseponse(
        val author:String,
        val title:String,
        val num_comments:Int,
        val created:Long,
        val thumbnail:String,
        val url:String?
)
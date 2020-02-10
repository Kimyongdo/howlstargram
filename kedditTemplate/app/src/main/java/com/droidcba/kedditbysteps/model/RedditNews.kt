package com.droidcba.kedditbysteps.model

import android.os.Parcel
import android.os.Parcelable

//ctrl+alt+s -> plug in => Parceable kotlin
data class RedditNews(
        val after: String,
        val before: String,
        val news: List<RedditNewsItem>
//오른쪽 클릭 - generate - parceable 클릭
) : Parcelable {
    constructor(source: Parcel) : this(
            source.readString(),
            source.readString(),
            ArrayList<RedditNewsItem>().apply { source.readList(this, RedditNewsItem::class.java.classLoader) }
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(after)
        writeString(before)
        writeList(news)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<RedditNews> = object : Parcelable.Creator<RedditNews> {
            override fun createFromParcel(source: Parcel): RedditNews = RedditNews(source)
            override fun newArray(size: Int): Array<RedditNews?> = arrayOfNulls(size)
        }
    }
}
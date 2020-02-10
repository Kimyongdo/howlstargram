package com.droidcba.kedditbysteps.model

import android.os.Parcel
import android.os.Parcelable
import com.droidcba.kedditbysteps.adapter.AdapterConstant
import com.droidcba.kedditbysteps.adapter.ViewType

//
data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComment: Int,
        val created: Long,
        val thnumbnail: String,
        val url: String?

) : ViewType,
        //여기서도 parceable을 사용
        Parcelable {
    override fun getViewType() = AdapterConstant.NEWS

    constructor(source: Parcel) : this(
            source.readString(),
            source.readString(),
            source.readInt(),
            source.readLong(),
            source.readString(),
            source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(author)
        writeString(title)
        writeInt(numComment)
        writeLong(created)
        writeString(thnumbnail)
        writeString(url)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<RedditNewsItem> = object : Parcelable.Creator<RedditNewsItem> {
            override fun createFromParcel(source: Parcel): RedditNewsItem = RedditNewsItem(source)
            override fun newArray(size: Int): Array<RedditNewsItem?> = arrayOfNulls(size)
        }
    }
}
package com.droidcba.kedditbysteps.adapter

import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.droidcba.kedditbysteps.R
import com.droidcba.kedditbysteps.inflate

// :ViewTypeDelegateAdapter  상속받음
class NewsDelegateAdapter(val viewaction : onViewSelectedListener) :ViewTypeDelegateAdapter{

    interface onViewSelectedListener{
        fun onItemSelected(url:String?)
    }

    //:ViewTypeDelegateAdapter 를 상속받았으니 반드시 써주어야한다.
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        TODO()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        TODO()
    }

    inner class NewsViewHolder(parent: ViewGroup):RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_items))

    private val imgThumbnail =  Itemv
}
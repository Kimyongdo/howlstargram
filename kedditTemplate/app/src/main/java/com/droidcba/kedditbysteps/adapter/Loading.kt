package com.droidcba.kedditbysteps.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.droidcba.kedditbysteps.R
import com.droidcba.kedditbysteps.inflate

class LoadingDelegateAdapter:ViewTypeDelegateAdapter {
//    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
//        LoadingViewHolder(parent)
//    } //아래로 줄여쓸 수 있다.
    override fun onCreateViewHolder(parent: ViewGroup)=LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

    }

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(
            R.layout.news_item_loading
    ))


}
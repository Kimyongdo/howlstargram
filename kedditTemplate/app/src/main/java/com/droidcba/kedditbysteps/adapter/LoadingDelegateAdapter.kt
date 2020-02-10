package com.droidcba.kedditbysteps.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.droidcba.kedditbysteps.R
import com.droidcba.kedditbysteps.inflate

//ViewTypeDelegateAdapter를 상속받음
class LoadingDelegateAdapter:ViewTypeDelegateAdapter {
//    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
//        LoadingViewHolder(parent)
//    } //아래로 줄여쓸 수 있다.

    //상속받은 두개의 함수(반드시 오버라이드 해줘야하는 것)
    //onCreateViewHolder에서는 onCreateViewHolder가 호출되도록 한다.
    override fun onCreateViewHolder(parent: ViewGroup)=LoadingViewHolder(parent) //싱클톤. 한줄로 호출

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

    }

    //LoadingDelegateAdapter만의 클래스 따로 생성
    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(
            R.layout.news_item_loading
    ))


}
package com.droidcba.kedditbysteps.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

//여기가 첫번째로 만들어짐.
//인터페이스를 만들어서 이를 상속할 예정
interface  ViewTypeDelegateAdapter{
    //:RecyclerView.ViewHolder은 반환값  : 상속인 경우나 반환인 경우가 헷갈림, 혹은 자료형인지

    //recyclervie에 필요한 메소드를 미리 만들어둠
    fun onCreateViewHolder(parent:ViewGroup):RecyclerView.ViewHolder
    fun onBindViewHolder(holder:RecyclerView.ViewHolder, item:ViewType)//[2]ViewType 따로 만듦

}
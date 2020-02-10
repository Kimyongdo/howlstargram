package com.droidcba.kedditbysteps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

//ViewGroup(내장함수)에 .inflate라는 추가메소드 만들기
//int만 지정하면 되고 this, attachRoot는 이미 지정됨
fun ViewGroup.inflate(layoutId: Int, attachRoot:Boolean=false): View {
    //inflate을 추가하여 아래와 같은 함수를 추가한다.
    return LayoutInflater.from(context).inflate(layoutId, this, attachRoot)
}
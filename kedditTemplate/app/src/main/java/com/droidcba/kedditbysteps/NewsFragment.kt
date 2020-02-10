package com.droidcba.kedditbysteps

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_news.*

//main에서 보여줄 일부인 newsFragement
//프래그먼트 상속
class NewsFragment: Fragment(){

    //[1]
    //var은 null가능성이 있기에 RecyclerView? 사용
    //private var newsList: RecyclerView?=null

    private val newsList by lazy{ //이렇게도도 사용할 수 있다.
        news_list //xml 요소, view?.findViewById(R.id.news_list) as RecyclerView와 같다. syntheic으로 요약
    }

    //프래그먼트 라이프사이클
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

        //[1]
        //!!은 null아님을 단정짓기- 이렇게 하는 이유 매개변수가 LayoutInflater?로 ?가 있기 때문임.(null가능성)
        //프래그먼트 view에 띄울 내용 : R.layout.fragment_news
        //val view = inflater!!.inflate(R.layout.fragment_news,container,false)
        //매개변수 inflater를 사용하지 않고 매개변수 container를 사용해서 만들기.
        //[2]-->val view = container?.inflate(R.layout.fragment_news) //Extension.kt을 만들어서 ViewGroup에 inflate 함수를 추가할 예정.
        //container 그 자체로 inflater가 가능하며 common패키지에서 따로 확장함수를 만들면 직관적으로 만들 수 있다.
        //자바에서 접근하려면 Extension.Kt.inflater(container, R.layout.news_fragment);
        //newsList xml과 연결 : 타입은 as RecyclerView?
        //newsList = view.findViewById(R.id.news_list) as RecyclerView?
        //newsList?.setHasFixedSize(true) //성능향상
        //newsList?.layoutManager = LinearLayoutManager(context) //리아시클러뷰의 핵심요소
        //return  view

        //[2]
        //gradle에서 apply plugin: 'kotlin-android-extensions'을 쓰면 findViewById()대체 가능 - 코틀린 생성시 추가된 플러그인
        //import kotlinx.android.synthetic.main.fragment_news.* 를 사용하여 synthetic에서 접근함.
        //[1]번의 요소를 [2]와 같이 바꿀 수 있음. - findViewById 소멸
        //val view = container?.inflate(R.layout.fragment_news)
        //news_list.setHasFixedSize(true)  //news_list는 NewsFragment의 xml에 있는 Recyclerview id요소
        //news_list.layoutManager = LinearLayoutManager(context)
        //return view!!//container?에 ?가 있으므로 null아님을 알려줘야함.
        //return  view!! //container?이므로 !!를 써줘야한다.

        //container는 ViewGroup을 상속받았으니 container에서도 inflate가 있을 것이고 이 inflate는 Extensiton.kt에서 지정함
        val view = container?.inflate(R.layout.fragment_news)//inflate를 만든 것
//        newsList.setHasFixedSize(true)//이때 초기화가 처음으로 됨 by lazy사용
//        newsList.layoutManager=LinearLayoutManager(context)
        return  view!!
        // inflate -> view 반납 -> onActivity -> newList 호출

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val newsList by lazy{ //이렇게도도 사용할 수 있다
            newsList.setHasFixedSize(true)//이때 초기화가 처음으로 됨 by lazy사용
            newsList.layoutManager=LinearLayoutManager(context)
            news_list //리턴타입으로 활용됨. return이 문자가 없어도 by lazy특성임
        }

    }
}
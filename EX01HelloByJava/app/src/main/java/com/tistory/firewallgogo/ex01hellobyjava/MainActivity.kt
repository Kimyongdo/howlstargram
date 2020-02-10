package com.tistory.firewallgogo.ex01hellobyjava

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var tv: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main);
//화면에 보여질 View객체 생성하기!!
        val btn = Button(this) //괄호 안에 무조건 this를 넣어야함 : 규칙.
        btn.text = "눌러주세요"
        //setContentView(btn);                   //add대신 set를 사용한다.
//글씨를 보여주는 View객체 생성
        tv = TextView(this)
        tv!!.text = "어서 눌러"
        tv!!.textSize = 32f
        tv!!.setTextColor(Color.BLUE)
        //setContentView(tv);                   //add는 여러개, set은 한개.
//activity는 한번에 하나만 구현가능 - btn 사라짐.
//btn 아래 깔린게 아니고 그냥 사라진 것.
//Activity는 한버넹 1개의 View만 설정할 수 있음.
//그래서 viewgroup을 1개 만들고 그 안에 View들을 추가
        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.addView(btn)
        linearLayout.addView(tv)
        setContentView(linearLayout)
        //버튼 클릭하는 것에 반응하기 리스너추가하기
        btn.setOnClickListener {
            //텍스트뷰 글씨 변경하기
            tv!!.text = "Nice to meet you"
        }
    }
}
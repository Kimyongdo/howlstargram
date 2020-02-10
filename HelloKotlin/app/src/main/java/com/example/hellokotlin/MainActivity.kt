package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.* //main의 xml 모든것을 다 쓰겠다.

class MainActivity : AppCompatActivity() { //extends 없어지고 :가 생김. implementation도 :

    override fun onCreate(savedInstanceState: Bundle?) { //return type = fun,  savedInstanceState: Bundle? - 자바와 거꾸로, 변수명-자료형
        super.onCreate(savedInstanceState) //슈퍼클래스 상속
        setContentView(R.layout.activity_main)//layout
        //문장을 끝내는 ;이 옵션, 쓰던말던


    }

    fun clickbtn(view: View) {
        //XML에서 지정한 id를 곧바로 변수명으로 사용함
        //
        tv.setText("Nice to mee you. Kotlin!!")


    } //void -> fun으로 이동/ 앞에 있는게 변수명 뒤에 있는게 자료형


    //onResume 메소드 오버라이드
    override fun onResume(){ //override함수라면 명시적으로 override를 써야한다.
        super.onResume()
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
    }
}

//안드로이드
//dp는 디스플레이 해상도 '160dpi'를 기준으로 (160dpi는 1제곱인치 안에 160개의 도트가 있음)
//1픽셀=1dp  맞추도록 알아서 ui를 스케일링해주게 됩니다(스케일링 : 이미지의 크기를 조정)
//sp - scale - independent pixels
//sp는 기본적으로 dp와 같이  
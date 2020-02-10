package com.droidcba.kedditbysteps

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //1강 MainActivity/NewsFragment/Extension.kt



    //onCreate 생명주기
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //R.layout.activity_main을 보여주는 중
        setContentView(R.layout.activity_main)
        //툴바 적용-findViewByID는 왜 쓴 걸까?? 안써도 가능하지 않을까
        val toolbar = findViewById<Toolbar> (R.id.toolbar)
        setSupportActionBar(toolbar)
    }//onCreate 종료

    //프래그먼트 변경부분 함수로
    fun changeFragment(f: Fragment, cleanStack: Boolean = false) {
        //beginTransaction을 쓰면 프래그먼트를 제거,변경,추가 할 수 있음.
        val ft = supportFragmentManager.beginTransaction()
        //true로 바뀌면 아래 함수 실행
        if (cleanStack) {
            clearBackStack()
        }
        //애니메이션 효과
        ft.setCustomAnimations(
                R.anim.abc_fade_in, R.anim.abc_fade_out, R.anim.abc_popup_enter, R.anim.abc_popup_exit)
        //main activity에 있는 fragment id. -> f로 이동
        ft.replace(R.id.activity_base_content, f)
        //프래그먼트를 백스택에 저장시킨다.
        ft.addToBackStack(null)
        //프래그먼트 작업을 완료한다 - beginTransaction와 연동되는 부분
        ft.commit()
    }

    //프래그먼트 소환 시 백스택에 쌓인다 이전 프래그먼트를 제거할 필요가 있다.
    fun clearBackStack() {
        //프래그먼트 매니저 소환
        val manager = supportFragmentManager
        //백스택에 쌓여진 개수가 0개 이상이라면
        if (manager.backStackEntryCount > 0) {
            //스택구조 - 선입선출구조 pop(나감) push(들어감)
            //스택에 0번(가장 아래)를 첫번째로 지정
            val first = manager.getBackStackEntryAt(0)
            //POP_BACK_STACK_INCLUSIVE를 쓰면 first.id를 제외한 나머지 위에 있는 스택들(프래그먼트) 모두 제거
            manager.popBackStack(first.id, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }

    /**
     * Finish activity when reaching the last fragment.
     */
    //뒤로가기 눌렀을 때
    override fun onBackPressed() {
        //프래그먼트 작동시 매니저는 필수
        val fragmentManager = supportFragmentManager
        if (fragmentManager.backStackEntryCount > 1) {
            //화면이 스택에 쌓여있다면 하나를 뺀다.
            fragmentManager.popBackStack()
        } else {
            //01개 이하라면 앱을 종료
            finish()
        }
    }


}

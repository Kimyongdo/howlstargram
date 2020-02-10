package com.tistory.firewallgogo.ex02widget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //XML에서 만든  Textview를 참조하여 제어하기
        TextView tv = findViewById(R.id.tv); //new는 xml에서 이미 실행함.
        tv.setSelected(true);

    }
}

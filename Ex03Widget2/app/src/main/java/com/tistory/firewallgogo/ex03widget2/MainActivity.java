package com.tistory.firewallgogo.ex03widget2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //멤버변수
    TextView tv; //멤버변수 - 참조형, 기본값 null
    Button btn;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//onCreate가 끝나야 화면에 보인다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //xml 창에서 찾겠다.

        //xml에서 만들어진 view 객체를 찾아와서 참조변수에 대입
        tv =findViewById(R.id.tv); //tv = new Text(); 하지 않음 xml을 가져오기 때문에.  this. 생략함.
        btn=findViewById(R.id.btn); //this. 생략함.
        et=findViewById(R.id.et);

        //버튼이 클릭되면 TextView의 글씨를 변경!
        //버튼클릭 이벤트를 듣는 리스너 객체를 생성 및 붙이기
        btn.setOnClickListener(new View.OnClickListener() {
            //버튼이 클릭되면 자동으로 실행되는 콜백메소드
            @Override
            public void onClick(View view) {
                //EditText에 써 있는 글씨 얻어오기!
                Editable editable = et.getText(); //editable이 리턴값
                String str = editable.toString(); //가져온 값을 str로 옮긴다.

                //텍스트뷰의 글씨 변경하기
                tv.setText(str);

            }
        }); //addactionlistener 대신에 변경





    }
}

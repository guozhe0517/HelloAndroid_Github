package com.guozhe.android.helloword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
// 클릭리스너 구현하는 방법 세가지
//1.위젯을 사용하는  객체가
//2.객체내에서 변수로 생성
//

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=(TextView)findViewById(R.id.test);
        btn=(Button)findViewById(R.id.Click);
        //3
//        btn.setOnClickListener(new TextView.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                tv.setText("안녕 안드로이드!");
//            }
//        });


        //2

       //1

    }


}

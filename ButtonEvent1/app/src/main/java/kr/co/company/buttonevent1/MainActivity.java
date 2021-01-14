package kr.co.company.buttonevent1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    내부 클래스를 이용하는 경우
//    class MyListenerClass implements View.OnClickListener{
//        public void onClick(View V){
//            Toast.makeText(getApplicationContext(),"버튼이 눌렸습니다.",Toast.LENGTH_SHORT).show();
//        }
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=(Button)findViewById(R.id.button1);
//        MyListenerClass buttonListener = new MyListenerClass(); 내부 클래스 이용방법
//        button1.setOnClickListener(buttonListener);

//        무명 클래스를 이용하는 방법
//        button1.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                Toast.makeText(getApplicationContext(),"버튼이 눌렸습니다.", Toast.LENGTH_SHORT).show();
//            }
//        });

//        람다식을 이용하는 경우
        button1.setOnClickListener((v)->{Toast.makeText(getApplicationContext(),"버튼이 눌렸습니다",Toast.LENGTH_SHORT).show();});
    }}
package kr.co.company.userinterface2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout contanier=new LinearLayout(this);
        contanier.setOrientation(LinearLayout.VERTICAL);

        Button b1= new Button(this);
        b1.setText("첫번째 버튼");
        contanier.addView(b1);

        Button b2=new Button(this);
        b2.setText("두번째 버튼");
        contanier.addView(b2);

        setContentView(contanier);
    }
}
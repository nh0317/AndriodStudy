package kr.co.company.edittexttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final EditText eText;
        Button btn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);
        eText=(EditText) findViewById(R.id.edittext);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String str=eText.getText().toString();
                Toast.makeText(getBaseContext(),str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
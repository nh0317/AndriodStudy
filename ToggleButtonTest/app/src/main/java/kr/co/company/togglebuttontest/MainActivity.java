package kr.co.company.togglebuttontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleClicked(View view){
        boolean on=((ToggleButton) view).isChecked();
        if(on){
            Toast.makeText(getApplicationContext(), "Checked", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(),"Not checked",Toast.LENGTH_SHORT).show();
        }
    }
}
package kr.co.company.tmepconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(EditText) findViewById(R.id.editText);
    }

    public void onClicked(View view){
        switch (view.getId()){
            case  R.id.button:
                RadioButton celsiusButton =(RadioButton) findViewById(R.id.celcius);
                RadioButton fahrenheitButton=(RadioButton) findViewById(R.id.fahrenheit);
                if(text.getText().length()==0){
                    Toast.makeText(this,"정황학 값을 입력하세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                float inputValue = Float.parseFloat(text.getText().toString());
                if(celsiusButton.isChecked()){
                    text.setText(String.valueOf(convertFahrenheitToCelsius(inputValue)));
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);
                }else{
                    text.setText(String.valueOf(convertCelsiusToFahrenheit(inputValue)));
                    fahrenheitButton.setChecked(false);
                    celsiusButton.setChecked(true);
                }
                break;
        }
    }
    private float convertFahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit-32)*5/9);
    }
    private float convertCelsiusToFahrenheit(float celsius){
        return ((celsius*9)/5+32);
    }
}
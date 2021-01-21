package kr.co.company.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup group;
    RadioButton button1, button2, button3;
    Button button;
    ImageView image;

    View.OnClickListener radio_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (group.getCheckedRadioButtonId()){
                case R.id.ver2_3_3:
                    image.setImageResource(R.drawable.pic1);
                    break;
                case R.id.ver4_1:
                    image.setImageResource(R.drawable.pic2);
                    break;
                case R.id.ver4_4:
                    image.setImageResource(R.drawable.pic3);
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Survey");

        group=(RadioGroup) findViewById(R.id.radioGroup);
        button1=(RadioButton) findViewById(R.id.ver2_3_3);
        button2=(RadioButton) findViewById(R.id.ver4_1);
        button3=(RadioButton) findViewById(R.id.ver4_4);

        button1.setOnClickListener(radio_listener);
        button2.setOnClickListener(radio_listener);
        button3.setOnClickListener(radio_listener);

        button=(Button) findViewById(R.id.displayButton);
        image=(ImageView) findViewById(R.id.image);
    }
}
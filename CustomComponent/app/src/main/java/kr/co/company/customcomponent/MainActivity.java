package kr.co.company.customcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RatingBar ratingbar=(RatingBar) findViewById(R.id.ratingBar);
        VolumControlView view = (VolumControlView) findViewById(R.id.volume);
        view.setKnobListener(new VolumControlView.KnobListener() {
            @Override
            public void onChanged(double angle) {
                //예제의 코드를 변경함
                //각도/30을 ratingbar에 표시 
                if(angle>0)
                    ratingbar.setRating((float)angle/30);
                else ratingbar.setRating(-(float)angle/30);
//
//                float rating = ratingbar.getRating();
//                if(angle>0 && rating<7.0)
//                    ratingbar.setRating(rating+1.0f);
//                else if (rating >0.0)
//                    ratingbar.setRating(rating-1.0f);
            }
        });
    }
}
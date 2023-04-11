package com.example.ratingapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView =findViewById(R.id.textView2);

    }

    public void  submit(View view){
        float ratingvalue =ratingBar.getRating();


        if (ratingvalue < 2) {
            textView.setText( " we will try our better next time");

        } else if (ratingvalue <= 3 && ratingvalue >= 2) {
            textView.setText( " we will work hard");

        } else if (ratingvalue <= 4 && ratingvalue >= 3) {
            textView.setText("we are in process");
        } else if (ratingvalue <= 5 && ratingvalue >= 4) {
            textView.setText( "Thank you for the feedback");
        }
    }
}

package com.example.pdp_t4_9_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    private Button facebook, youtube, twitter;

    View lottie_android, lottie_youtube, lottie_twitter, lottie_facebook;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fv();
        clickButton();
    }

    private void fv() {
        facebook=findViewById(R.id.facebook_btn);
        youtube=findViewById(R.id.youtube_btn);
        twitter=findViewById(R.id.twitter_btn);

        lottie_android=findViewById(R.id.lottie_android);
        lottie_twitter=findViewById(R.id.lottie_twitter);
        lottie_facebook=findViewById(R.id.lottie_facebook);
        lottie_youtube=findViewById(R.id.lottie_youtube);

    }

    private void clickButton() {
        facebook.setOnClickListener(view -> {
            lottie_twitter.setVisibility(View.GONE);
            lottie_android.setVisibility(View.GONE);
            lottie_facebook.setVisibility(View.VISIBLE);
            lottie_youtube.setVisibility(View.GONE);
        });
        youtube.setOnClickListener(view -> {
            lottie_twitter.setVisibility(View.GONE);
            lottie_android.setVisibility(View.GONE);
            lottie_facebook.setVisibility(View.GONE);
            lottie_youtube.setVisibility(View.VISIBLE);
        });
        twitter.setOnClickListener(view -> {
            lottie_twitter.setVisibility(View.VISIBLE);
            lottie_android.setVisibility(View.GONE);
            lottie_facebook.setVisibility(View.GONE);
            lottie_youtube.setVisibility(View.GONE);
        });

    }

}
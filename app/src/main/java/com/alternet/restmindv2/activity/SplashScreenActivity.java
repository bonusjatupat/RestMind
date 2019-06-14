package com.alternet.restmindv2.activity;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.alternet.restmindv2.R;


public class SplashScreenActivity extends AppCompatActivity {

    private long SPLASH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //TODO : Add main activity
                startActivity(new Intent(SplashScreenActivity.this , TutorialActivity.class));
                finish();
            }
        }, SPLASH_SCREEN_DELAY);

    }
}

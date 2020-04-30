package com.basbas.tutorialjavaonclick.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.basbas.tutorialjavaonclick.R;
import com.basbas.tutorialjavaonclick.spinner.SpinnerActivity;

public class SplashScreenActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        //logic splashscreen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //kelas tujuan
                startActivity(new Intent(SplashScreenActivity.this, SpinnerActivity.class));
                finish();
            }
        }, 4000);
    }
}
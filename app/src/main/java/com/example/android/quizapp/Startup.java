package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Startup extends AppCompatActivity {

    ImageView startimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        startimage = (ImageView) findViewById(R.id.start_up_image);
        Animation startUpAnimation = AnimationUtils.loadAnimation(this,R.anim.myanimation);
        startimage.startAnimation(startUpAnimation);

        final Intent i = new Intent(this, login.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();
    }
}

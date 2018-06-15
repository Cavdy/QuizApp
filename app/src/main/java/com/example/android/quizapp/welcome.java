package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class welcome extends AppCompatActivity {

    TextView username_text_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        username_text_get = (TextView) findViewById(R.id.welcome_text);
        username_text_get.setText(" " + getIntent().getStringExtra("NAME"));
        Animation userAnimation = AnimationUtils.loadAnimation(this, R.anim.myanimation);
        username_text_get.startAnimation(userAnimation);

        String tofirstquiz = getIntent().getStringExtra("NAME");
        final Intent i = new Intent(this, first.class);
        i.putExtra("FIRSTQUIZ", tofirstquiz);
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

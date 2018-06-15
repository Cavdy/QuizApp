package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class total extends AppCompatActivity {
    TextView tv;
    TextView username_text_get;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);

        username_text_get = (TextView) findViewById(R.id.textView2);
        username_text_get.setText(getIntent().getStringExtra("NAME"));
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("POINTS", 0);
        tv = (TextView) findViewById(R.id.textview1);
        tv.setText("Your Score is " + intValue);
    }

    public void gohome(View view) {
        Intent gohome = new Intent(this, login.class);
        startActivity(gohome);
    }
}

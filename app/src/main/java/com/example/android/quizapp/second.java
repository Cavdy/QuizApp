package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView username_text_get;
    String usernamedata;
    int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        username_text_get = (TextView) findViewById(R.id.textView2);
        username_text_get.setText("Hi, " + getIntent().getStringExtra("NAME"));
        Intent mIntent = getIntent();
        points = mIntent.getIntExtra("POINTS", 0);
        usernamedata = getIntent().getStringExtra("NAME");
    }

    public void btn(View v){
        points = points + 0;
        Intent ansone = new Intent(this, third.class);
        ansone.putExtra("POINTS", points);
        ansone.putExtra("NAME", usernamedata);
        startActivity(ansone);
    }

    public void btn1(View v){
        points = points + 1;
        Intent anstwo = new Intent(this, third.class);
        anstwo.putExtra("POINTS", points);
        anstwo.putExtra("NAME", usernamedata);
        startActivity(anstwo);
    }

    public void btn2(View v){
        points = points + 0;
        Intent ansthree = new Intent(this, third.class);
        ansthree.putExtra("POINTS", points);
        ansthree.putExtra("NAME", usernamedata);
        startActivity(ansthree);
    }

    public void btn3(View v){
        points = points + 0;
        Intent ansfour = new Intent(this, third.class);
        ansfour.putExtra("POINTS", points);
        ansfour.putExtra("NAME", usernamedata);
        startActivity(ansfour);
    }

    public void skip(View view) {
        points = points + 0;
        Intent skipping = new Intent(this, third.class);
        skipping.putExtra("POINTS", points);
        skipping.putExtra("NAME", usernamedata);
        startActivity(skipping);
    }

    public void gohome(View view) {
        Intent gohome = new Intent(this, login.class);
        startActivity(gohome);
    }
}

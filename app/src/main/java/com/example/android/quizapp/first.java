package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class first extends AppCompatActivity {
    TextView username_text_get;
    int points = 0;
    String usernamedata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        username_text_get = (TextView) findViewById(R.id.textView2);
        username_text_get.setText("Hi, " + getIntent().getStringExtra("FIRSTQUIZ"));
        usernamedata = getIntent().getStringExtra("FIRSTQUIZ");
    }

    public void btn(View v){
        points = points + 0;
        Intent ansone = new Intent(this, second.class);
        ansone.putExtra("POINTS", points);
        ansone.putExtra("NAME", usernamedata);
        startActivity(ansone);
    }

    public void btn1(View v){
        points = points + 1;
        Intent anstwo = new Intent(this, second.class);
        anstwo.putExtra("POINTS", points);
        anstwo.putExtra("NAME", usernamedata);
        startActivity(anstwo);
    }

    public void btn2(View v){
        points = points + 0;
        Intent ansthree = new Intent(this, second.class);
        ansthree.putExtra("POINTS", points);
        ansthree.putExtra("NAME", usernamedata);
        startActivity(ansthree);
    }

    public void btn3(View v){
        points = points + 0;
        Intent ansfour = new Intent(this, second.class);
        ansfour.putExtra("POINTS", points);
        ansfour.putExtra("NAME", usernamedata);
        startActivity(ansfour);
    }

    public void skip(View view) {
        points = points + 0;
        Intent skipping = new Intent(this, second.class);
        skipping.putExtra("POINTS", points);
        skipping.putExtra("NAME", usernamedata);
        startActivity(skipping);
    }

    public void gohome(View view) {
        Intent gohome = new Intent(this, login.class);
        startActivity(gohome);
    }
}

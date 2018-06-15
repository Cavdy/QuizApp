package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class third extends AppCompatActivity {
    TextView username_text_get;
    String usernamedata;
    int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        username_text_get = (TextView) findViewById(R.id.textView2);
        username_text_get.setText("Hi, " + getIntent().getStringExtra("NAME"));
        Intent mIntent = getIntent();
        points = mIntent.getIntExtra("POINTS", 0);
        usernamedata = getIntent().getStringExtra("NAME");
    }

    public void btn(View view) {
        CheckBox ans1 = (CheckBox) findViewById(R.id.ans1);
        boolean ansone1 = ans1.isChecked();
        CheckBox ans2 = (CheckBox) findViewById(R.id.ans2);
        boolean anstwo2 = ans2.isChecked();
        CheckBox ans3 = (CheckBox) findViewById(R.id.ans3);
        boolean ansthree3 = ans3.isChecked();
        CheckBox ans4 = (CheckBox) findViewById(R.id.ans4);
        boolean ansfour4 = ans4.isChecked();

        if(ansone1 == true) {
            points = points + 1;
            Intent anstwo = new Intent(this, fourth.class);
            anstwo.putExtra("POINTS", points);
            anstwo.putExtra("NAME", usernamedata);
            startActivity(anstwo);
        } else if(anstwo2 == true) {
            points = points + 0;
            Intent ansone = new Intent(this, fourth.class);
            ansone.putExtra("POINTS", points);
            ansone.putExtra("NAME", usernamedata);
            startActivity(ansone);
        } else if(ansthree3 == true) {
            points = points + 0;
            Intent ansone = new Intent(this, fourth.class);
            ansone.putExtra("POINTS", points);
            ansone.putExtra("NAME", usernamedata);
            startActivity(ansone);
        } else if(ansfour4 == true) {
            points = points + 0;
            Intent ansone = new Intent(this, fourth.class);
            ansone.putExtra("POINTS", points);
            ansone.putExtra("NAME", usernamedata);
            startActivity(ansone);
        } else {
            Toast.makeText(this, "Please Choose one", Toast.LENGTH_SHORT).show();
        }
    }

    public void skip(View view) {
        points = points + 0;
        Intent skipping = new Intent(this, fourth.class);
        skipping.putExtra("POINTS", points);
        skipping.putExtra("NAME", usernamedata);
        startActivity(skipping);
    }

    public void gohome(View view) {
        Intent gohome = new Intent(this, login.class);
        startActivity(gohome);
    }
}

package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText usernameText;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameText = (EditText) findViewById(R.id.username_login);
        loginBtn = (Button) findViewById(R.id.log_in_btn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameLoginText = usernameText.getText().toString();
                if(usernameLoginText != null && !usernameLoginText.trim().isEmpty()) {
                    Intent welcomeIntent = new Intent(login.this, welcome.class);
                    welcomeIntent.putExtra("NAME", usernameLoginText);
                    startActivity(welcomeIntent);
                } else {
                    Toast.makeText(login.this, "Please put in your username", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

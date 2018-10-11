package com.example.android.constraintlayoutpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String mainHeadingTextView = "BEEN A WHILE?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button slackButton = (Button)findViewById(R.id.buttonChange1);
/*
        slackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSlack = new Intent(MainActivity.this, SlackActivity.class);
                startActivity(intentSlack);
            }
        });
        */
    }
}
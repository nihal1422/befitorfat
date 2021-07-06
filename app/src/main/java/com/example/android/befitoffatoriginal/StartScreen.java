package com.example.android.befitoffatoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import java.util.TimerTask;

import java.util.Timer;

public class StartScreen extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(StartScreen.this,SignIn.class);
                startActivity(intent);
                finish();
            }
        },2500);
    }
}

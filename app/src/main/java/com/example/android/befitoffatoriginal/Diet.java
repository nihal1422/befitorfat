package com.example.android.befitoffatoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Diet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        Button body = (Button) findViewById(R.id.button2);
        Button aero = (Button) findViewById(R.id.button3);
        Button faty = (Button) findViewById(R.id.button4);
        Button card = (Button) findViewById(R.id.button5);

        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fatIntent = new Intent(Diet.this, Bodybuilding_Diet.class);

                startActivity(fatIntent);
            }
        });
    }
}
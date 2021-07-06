package com.example.android.befitoffatoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView sign = (ImageView) findViewById(R.id.aerobics);
        ImageView bulk = (ImageView) findViewById(R.id.body);
        ImageView fat = (ImageView) findViewById(R.id.fatloss);

        fat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fatIntent = new Intent(Home.this, Fatloss.class);

                startActivity(fatIntent);
            }
        });

        bulk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bulkIntent = new Intent(Home.this, Bulking.class);

                startActivity(bulkIntent);
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(Home.this, Aerobics.class);

                startActivity(numbersIntent);
            }
        });
    }
}
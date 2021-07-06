package com.example.android.befitoffatoriginal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Bodybuilding_Diet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodybuilding__diet);

        ImageView body_veg = (ImageView) findViewById(R.id.imageView3);

        body_veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fatIntent = new Intent(Bodybuilding_Diet.this, Body_Veg_Diet.class);

                startActivity(fatIntent);
            }
        });
    }
}
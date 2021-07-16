package com.ebeatsz.contactapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv_mode, iv_phone, iv_location, iv_web;
    Button btn_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find View By ID
        iv_mode = findViewById(R.id.iv_mode);
        iv_phone = findViewById(R.id.iv_phone);
        iv_location = findViewById(R.id.iv_location);
        iv_web = findViewById(R.id.iv_web);
        btn_create = findViewById(R.id.btn_create);

        // Hide ImageView
        iv_mode.setVisibility(View.GONE);
        iv_phone.setVisibility(View.GONE);
        iv_location.setVisibility(View.GONE);
        iv_web.setVisibility(View.GONE);

        // Set click listener
        iv_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        iv_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        iv_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        iv_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Disable and enable btn on click after delay
                btn_create.setEnabled(false);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn_create.setEnabled(true);
                    }
                }, 200);

                // Intent to another activity
                Intent intent = new Intent(MainActivity.this, CreateContact.class);
                startActivity(intent);
            }
        });
    }
}
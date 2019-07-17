package com.example.alc4phase1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        Button btnProfile = findViewById(R.id.profile);
        Button btnAbout= findViewById(R.id.about);
        btnProfile.setOnClickListener(v-> navigateToActivity(Profile.class));
        btnAbout.setOnClickListener(v->navigateToActivity(Webview.class));
        ActionBar toolbar = getSupportActionBar();
        toolbar.setTitle("About ALC");
    }


    private void navigateToActivity(Class<?> cls) {
        Intent myIntent = new Intent(MainActivity.this, cls);
        startActivity(myIntent);
    }
    }

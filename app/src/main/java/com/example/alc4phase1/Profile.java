package com.example.alc4phase1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import java.time.Instant;

public class Profile extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_profile);

        ActionBar appBar=  getSupportActionBar();
        if(appBar!=null){
            appBar.setDisplayHomeAsUpEnabled(true);
            appBar.setTitle("My Profile");
        }
        ImageView profileImageView = findViewById(R.id.imageView);

        Glide.with(this)
                .load("https://avatars1.githubusercontent.com/u/18025235?s=460&v=4")
                .circleCrop()
                .into(profileImageView);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
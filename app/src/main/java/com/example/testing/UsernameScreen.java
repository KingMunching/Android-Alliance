package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UsernameScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username_screen);
    }
    public void toDifficultyScreen(View k){

        Intent j = new Intent(this,DifficultyScreen.class);
        startActivity(j);
    }

}
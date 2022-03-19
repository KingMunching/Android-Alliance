package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toUsernameScreen(View v){

        Intent i = new Intent(this,UsernameScreen.class);
        startActivity(i);
    }

    public void toDifficultyScreen(View v){

        Intent i = new Intent(this,DifficultyScreen.class);
        startActivity(i);
    }

    public void toAttemptsScreen(View v){

        Intent i = new Intent(this,AttemptsScreen.class);
        startActivity(i);
    }

}
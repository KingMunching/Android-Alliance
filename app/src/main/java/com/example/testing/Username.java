package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Username extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);

        button = findViewById(R.id.username_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toAttemptsScreen();
            }
        });

    }
    public void toAttemptsScreen(){
        Intent i = new Intent(this, AttemptsScreen.class);
        startActivity(i);
    }
}
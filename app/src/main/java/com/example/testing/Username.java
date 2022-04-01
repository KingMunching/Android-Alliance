package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Username extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);

        button = findViewById(R.id.UsernameBox);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toAttemptsScreen();
                String uS = button.getText().toString();
            }
        });


    }

    public void toAttemptsScreen(){
        Intent i = new Intent(this, AttemptsScreen.class);
        startActivity(i);
    }

}

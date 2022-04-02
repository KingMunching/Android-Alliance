package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Username extends AppCompatActivity {

    EditText et;
    Button button;
    String uS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);

        button = findViewById(R.id.UsernameBox);
        et = findViewById(R.id.editTextTextPersonName);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Username.this, AttemptsScreen.class);

                String name = et.getText().toString();

                i.putExtra("Value", name);

                startActivity(i);
            }
        });


    }
}

package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
                 uS = et.getText().toString();
                i.putExtra("Value",uS);
                startActivity(i);
            }
        });


    }

//    public void toAttemptsScreen(){
//        Intent i = new Intent(this, AttemptsScreen.class);
//        startActivity(i);
//    }

}

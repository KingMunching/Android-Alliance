package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AttemptsScreen extends AppCompatActivity {


    Button easyButton;
    Button mediumButton;
    Button hardButton;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attempts_screen);



        easyButton = findViewById(R.id.easy);
        mediumButton = findViewById(R.id.medium);
        hardButton = findViewById(R.id.hard);

        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toEasyDifficulty();
            }
        });

        mediumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMediumDifficulty();
            }
        });

        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toHardDifficulty();
            }
        });

    }

    public void toEasyDifficulty() {
        Intent i = new Intent(this,easy.class);
        Bundle fromStats = getIntent().getExtras();
        if (fromStats != null){
            String val = fromStats.getString("Value");
            i.putExtra("Value", val);
        }else{
            String name = getIntent().getStringExtra("Value");
            i.putExtra("Value", name);
        }
        startActivity(i);
    }

    public void toMediumDifficulty() {
        Intent i = new Intent(this,medium.class);
        Bundle fromStats = getIntent().getExtras();
        if (fromStats != null){
            String val = fromStats.getString("Value");
            i.putExtra("Value", val);
        }else{
            String name = getIntent().getStringExtra("Value");
            i.putExtra("Value", name);
        }
        startActivity(i);
    }
    public void toHardDifficulty() {
        Intent i = new Intent(this,hard.class);
        Bundle fromStats = getIntent().getExtras();
        if (fromStats != null){
            String val = fromStats.getString("Value");
            i.putExtra("Value", val);
        }else{
            String name = getIntent().getStringExtra("Value");
            i.putExtra("Value", name);
        }

        startActivity(i);
    }
}
package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StatsScreen extends AppCompatActivity {

    Button button1, button2;
    String name;
    TextView tv, ev;
    //EditText ev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_screen);

        ev = findViewById(R.id.Status); // finds Status textView in StatScreen.
        String score = getIntent().getStringExtra("Status"); // gets intent and retrieves status.
        ev.setText("Attempts remaining:" + score); // set textView as score.

        tv = findViewById(R.id.nameTV);
        String name = getIntent().getStringExtra("Value"); // gets intent and retrieves status.
        tv.setText("USERNAME:" + name); // set textView as score.

        button1 = findViewById(R.id.playAgain);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toAttemptsScreen();
            }
        });

        button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toHomeScreen();
            }
        });
    }

    public void toAttemptsScreen(){
        Intent i = new Intent(this, AttemptsScreen.class);
        String name = getIntent().getStringExtra("Value");
        i.putExtra("Value", name);
        startActivity(i);
    }

    public void toHomeScreen(){
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
    }

}
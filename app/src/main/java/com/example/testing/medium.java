package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class medium extends AppCompatActivity {
    int n;

    int attempts = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);
    }

    public void randomNumberGenerator(){
        Random rand = new  Random();
        n = rand.nextInt(50)+1;
    }

    public void guess2(View view) {
        randomNumberGenerator();
        EditText guess = (EditText) findViewById(R.id.guess2);
        int guessInt = Integer.parseInt(guess.getText().toString());


        if (n != guessInt) {

            attempts--;
            TextView result = (TextView) findViewById(R.id.result2);
            result.setText("Try Again!");
            TextView attempView = (TextView) findViewById(R.id.AttemptsViewM);
            attempView.setText("Attempts: " + attempts);

        }
        if (attempts == 0) {
            Intent i = new Intent(this, StatsScreen.class);
            String score = Integer.toString(attempts);
            i.putExtra("Status", score);
            String name = getIntent().getStringExtra("Value");
            i.putExtra("Value", name);
            startActivity(i);

        }

        if (n == guessInt) {
            Intent z = new Intent(this, StatsScreen.class);
            String score = Integer.toString(attempts);
            z.putExtra("Status", score);
            String name = getIntent().getStringExtra("Value");
            z.putExtra("Value", name);
            startActivity(z);
        }

    }

}
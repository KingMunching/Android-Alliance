package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class easy extends AppCompatActivity {

    int n;
    int attempts = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy);
        randomNumberGenerator();
    }

    public void randomNumberGenerator(){
        Random rand = new  Random();
        n = rand.nextInt(10)+1;
    }

    public void guess(View view) {
        EditText guess = (EditText) findViewById(R.id.guess);
        int guessInt = Integer.parseInt(guess.getText().toString());




        if(n > guessInt){
            TextView c = (TextView) findViewById(R.id.Score);
            c.setText("HIGHER!");
         }
        if(n < guessInt){
            TextView c = (TextView) findViewById(R.id.Score);
            c.setText("LOWER!");
         }


        if (n != guessInt) {

            attempts--;
            TextView result = (TextView) findViewById(R.id.result);
            result.setText("Try Again!");
            TextView attempView = (TextView) findViewById(R.id.AttemptsView);
            attempView.setText("Attempts: " + attempts);


        }
        if (attempts == 0) {
            Intent i = new Intent(this, StatsScreen.class);
            String score = Integer.toString(attempts);
            String number = Integer.toString(n);
            i.putExtra("Status", score);
            i.putExtra("Number", number);
            String name = getIntent().getStringExtra("Value");
            i.putExtra("Value", name);
            String winOrLose = "lose";
            i.putExtra("W",winOrLose);
            startActivity(i);

        }

        if (n == guessInt) {
            Intent z = new Intent(this, StatsScreen.class);
            String score = Integer.toString(attempts);
            String number = Integer.toString(n);
            z.putExtra("Status", score);
            z.putExtra("Number", number);
            z.putExtra("Status", score);
            String name = getIntent().getStringExtra("Value");
            z.putExtra("Value", name);
            String winOrLose = "win";
            z.putExtra("W",winOrLose);
            startActivity(z);
        }

    }


}
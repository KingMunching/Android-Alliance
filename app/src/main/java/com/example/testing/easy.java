package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class easy extends AppCompatActivity {
    int n;
    private int point = 0;
    private int attempts = 7;
    String message = "";

    public void randomNumberGenerator(){
        Random rand = new  Random();
        n = rand.nextInt(10)+1;
    }

    public void guess(View view) {
        randomNumberGenerator();
        EditText guess = (EditText) findViewById(R.id.guess);
        int guessInt = Integer.parseInt(guess.getText().toString());
        for (int i = 0; i < 8; i++) {
            if (n != guessInt) {
                message = "guess again";
                TextView result = (TextView) findViewById(R.id.result);
                result.setText("Try Again!");
            }
            else if (i == 7){
                message = "You Lost!";
            }
            else {
                message = "Correct!";
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
                point++;
                TextView txt = (TextView) findViewById(R.id.Score);
                txt.setText("Score: " +point);
                TextView result = (TextView) findViewById(R.id.result);
                result.setText("Correct!");
                break;
            }


            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy);
    }
}
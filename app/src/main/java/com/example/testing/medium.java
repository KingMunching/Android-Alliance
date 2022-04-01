package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class medium extends AppCompatActivity {

    int n;
    String message = "";

    public void randomNumberGenerator(){
        Random rand = new  Random();
        n = rand.nextInt(15)+1;
    }

    public void guess2(View view) {
        randomNumberGenerator();
        EditText guess2 = (EditText) findViewById(R.id.guess2);
        int guess2Int = Integer.parseInt(guess2.getText().toString());
        for (int i = 0; i < 8; i++) {
            if (n != guess2Int) {
                message = "guess2 again";
            }
            else if (i == 7){
                message = "You Lost!";
            }
            else {
                message = "Correct!";
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
                break;
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);
    }
}
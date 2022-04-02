package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class hard extends AppCompatActivity {

    int n;
    String message = "";

    public void randomNumberGenerator(){
        Random rand = new  Random();
        n = rand.nextInt(20)+1;
    }

    public void guess3(View view) {
        randomNumberGenerator();
        EditText guess3 = (EditText) findViewById(R.id.guess3);
        int guess3Int = Integer.parseInt(guess3.getText().toString());
        for (int i = 0; i < 8; i++) {
            if (i == 7){
                message = "You Lost!";
            }
            if (n != guess3Int) {
                message = "guess again";
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
        setContentView(R.layout.activity_hard);
    }
}
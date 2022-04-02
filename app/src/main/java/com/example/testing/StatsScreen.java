package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StatsScreen extends AppCompatActivity {

    Button button;
    String name;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_screen);

//        tv = findViewById(R.id.nameTV);
//
//        name = getIntent().getExtras().getString("Value");
//        tv.setText(name);

        button = findViewById(R.id.playAgain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toAttemptsScreen();
            }
        });
    }
    int totalPoint = 0;
    int totalAttempt = 0;
    double WinRate;

//    public StatsScreen(){
//        int PointcalcEasy = easy.getPoints();
//        int AttemptCalcEasy = easy.getAttemptCount();
//        int PointcalcMed = medium.getPoints();
//        int AttemptCalcMed = medium.getAttemptCount();
//        int PointcalcHard = hard.getPoints();
//        int AttemptCalcHard = hard.getAttemptCount();
//
//        totalPoint = totalPoint + PointcalcEasy + PointcalcMed + PointcalcHard;
//        totalAttempt = totalAttempt + AttemptCalcEasy + AttemptCalcMed + AttemptCalcHard;
//        WinRate = totalPoint / totalAttempt;
//
//    }
public void toAttemptsScreen(){
    Intent i = new Intent(this, AttemptsScreen.class);
    startActivity(i);
}

}
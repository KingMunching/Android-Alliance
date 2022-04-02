package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StatsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_screen);
    }
    int totalPoint = 0;
    int totalAttempt = 0;
    double WinRate;

    public StatsScreen(){
        int PointcalcEasy = easy.getPoints();
        int AttemptCalcEasy = easy.getAttemptCount();

        totalPoint = totalPoint + PointcalcEasy;
        totalAttempt = totalAttempt + AttemptCalcEasy;
        WinRate = totalPoint / totalAttempt;

    }

}
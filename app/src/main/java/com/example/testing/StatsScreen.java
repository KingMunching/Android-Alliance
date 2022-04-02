package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

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
        int PointcalcMed = medium.getPoints();
        int AttemptCalcMed = medium.getAttemptCount();
        int PointcalcHard = hard.getPoints();
        int AttemptCalcHard = hard.getAttemptCount();

        totalPoint = totalPoint + PointcalcEasy + PointcalcMed + PointcalcHard;
        totalAttempt = totalAttempt + AttemptCalcEasy + AttemptCalcMed + AttemptCalcHard;
        WinRate = totalPoint / totalAttempt;
        TextView WinR = (TextView) findViewById(R.id.WinR);
        TextView PoinT = (TextView) findViewById(R.id.PoinT);
        WinR.setText((int) WinRate);
        PoinT.setText((int)totalPoint);

    }

}
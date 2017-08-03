package com.example.android.lab03_courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scores = 0;
    private int scores2 = 0;
    private int threePoint = 3;
    private int twoPoint = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threeP(View view) {
        scores += threePoint;
        scoresQuantity();
    }
    public void twoP(View view) {
        scores += twoPoint;
        scoresQuantity();
    }
    public void oneP(View view) {
        ++scores;
        scoresQuantity();
    }

    private void scoresQuantity() {
        TextView sText = (TextView)findViewById(R.id.scores);
        sText.setText(String.valueOf(scores));
    }

    public void threeP2(View view) {
        scores2 += threePoint;
        scoresQuantity2();
    }
    public void twoP2(View view) {
        scores2 += twoPoint;
        scoresQuantity2();
    }
    public void oneP2(View view) {
        ++scores2;
        scoresQuantity2();
    }

    private void scoresQuantity2() {
        TextView sText = (TextView)findViewById(R.id.scores2);
        sText.setText(String.valueOf(scores2));
    }

    public void resP(View view) {
        scores =0;
        scores2=0;
        scoresQuantity();
        scoresQuantity2();
    }

}

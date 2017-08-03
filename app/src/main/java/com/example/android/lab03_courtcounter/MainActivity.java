package com.example.android.lab03_courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scores = 0;
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

    public void resP(View view) {
        scores =0;
        scoresQuantity();
    }

}

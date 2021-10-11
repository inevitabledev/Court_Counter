package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void free_one_1(View view) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    public void add_two_1(View view) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void add_three_1(View view) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void free_one_2(View view) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    public void add_two_2(View view) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void add_three_2(View view) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void cleartext(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
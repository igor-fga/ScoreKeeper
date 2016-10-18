package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int foulTeamA  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 Goal
     * @param view
     */
    public void addGoalForTeamA(View view)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 Goal
     * @param view
     */

    public void addGoalForTeamB(View view)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void addFoulForTeamA(View view)
    {
        foulTeamA += 1;
        displayFoulsForTeamA(foulTeamA);
    }

    /**
     * Display the given score for Team A
     * @param score
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the given score for Team B
     * @param score
     */

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsForTeamA(int foul)
    {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void displayFoulsForTeamB(int foul)
    {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

}

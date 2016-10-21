package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int foulTeamA = 0;
    private int foulTeamB = 0;
    private int yellowTeamA = 0;
    private int yellowTeamB = 0;
    private int redTeamA = 0;
    private int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 Goal
     *
     * @param view
     */
    public void addGoalForTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 Goal
     *
     * @param view
     */

    public void addGoalForTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the fouls for Team A by 1 foul
     *
     * @param view
     */
    public void addFoulForTeamA(View view) {
        foulTeamA += 1;
        displayFoulsForTeamA(foulTeamA);
    }

    /**
     * Increase the fouls for Team A by 1 foul
     *
     * @param view
     */
    public void addFoulForTeamB(View view) {
        foulTeamB += 1;
        displayFoulsForTeamB(foulTeamB);
    }

    /**
     * Increase the yellow card for Team A by 1 card
     *
     * @param view
     */
    public void addYellowForTeamA(View view) {
        yellowTeamA += 1;
        displayYellowForTeamA(yellowTeamA);
    }

    /**
     * Increase the yellow card for Team B by 1 card
     *
     * @param view
     */
    public void addYellowForTeamB(View view) {
        yellowTeamB += 1;
        displayYellowForTeamB(yellowTeamB);
    }


    /**
     * Increase the red card for Team A by 1 card
     *
     * @param view
     */
    public void addRedForTeamA(View view) {
        redTeamA += 1;
        displayRedForTeamA(redTeamA);
    }

    /**
     * Increase the red card for Team B by 1 card
     *
     * @param view
     */
    public void addRedForTeamB(View view) {
        redTeamB += 1;
        displayRedForTeamB(redTeamB);
    }

    /**
     * Reset the scores
     *
     * @param view
     */
    public void ResetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsForTeamA(foulTeamA);
        displayFoulsForTeamB(foulTeamB);
        displayYellowForTeamA(yellowTeamA);
        displayYellowForTeamB(yellowTeamB);
        displayRedForTeamA(redTeamA);
        displayRedForTeamB(redTeamB);
    }


    /**
     * Display the given score for Team A
     *
     * @param score
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the given score for Team B
     *
     * @param score
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the given foul for Team A
     *
     * @param foul
     */
    public void displayFoulsForTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Display the given foul for Team B
     *
     * @param foul
     */
    public void displayFoulsForTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Display the given yellow card for Team A
     *
     * @param card
     */
    public void displayYellowForTeamA(int card) {
        TextView yellowView = (TextView) findViewById(R.id.team_a_yellow);
        yellowView.setText(String.valueOf(card));
    }

    /**
     * Display the given yellow card for Team B
     *
     * @param card
     */
    public void displayYellowForTeamB(int card) {
        TextView yellowView = (TextView) findViewById(R.id.team_b_yellow);
        yellowView.setText(String.valueOf(card));
    }

    /**
     * Display the given red card for Team A
     *
     * @param card
     */
    public void displayRedForTeamA(int card) {
        TextView redView = (TextView) findViewById(R.id.team_a_red);
        redView.setText(String.valueOf(card));
    }


    /**
     * Display the given red card for Team B
     *
     * @param card
     */
    public void displayRedForTeamB(int card) {
        TextView redView = (TextView) findViewById(R.id.team_b_red);
        redView.setText(String.valueOf(card));
    }

}

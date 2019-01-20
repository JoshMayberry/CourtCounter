package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamA_score = 0;
    int teamB_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamA_score);
        displayForTeamA(teamB_score);
    }

    /**Resets the scores.
     *
     * Use For: Button Event
     */
    public void onReset(View view) {
        teamA_score = 0;
        teamB_score = 0;
        displayForTeamA(teamA_score);
        displayForTeamB(teamB_score);
    }

    /**Adds the appropriate amount to the score for Team A.
     *
     * Use For: Button Event
     */
    public void onTeamA_addPoints(View view) {
        switch (view.getId()) {
            case (R.id.teamA_add3):
                teamA_score += 3;
                break;
            case (R.id.teamA_add2):
                teamA_score += 2;
                break;
            case (R.id.teamA_add1):
                teamA_score += 1;
                break;
        }
        displayForTeamA(teamA_score);
    }

    /**Adds the appropriate amount to the score for Team B.
     *
     * Use For: Button Event
     */
    public void onTeamB_addPoints(View view) {
        switch (view.getId()) {
            case (R.id.teamB_add3):
                teamB_score += 3;
                break;
            case (R.id.teamB_add2):
                teamB_score += 2;
                break;
            case (R.id.teamB_add1):
                teamB_score += 1;
                break;
        }
        displayForTeamB(teamB_score);
    }

    /**Displays the given score for Team A.
     *
     * @param score - What score the team has
     *
     * Example Input: displayForTeamA(10)
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA_score);
        scoreView.setText(String.valueOf(score));
    }

    /**Displays the given score for Team B.
     *
     * @param score - What score the team has
     *
     * Example Input: displayForTeamB(10)
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_score);
        scoreView.setText(String.valueOf(score));
    }
}

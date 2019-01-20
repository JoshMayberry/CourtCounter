package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamA_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamA_score);
    }

    /**Adds the appropriate amount to the score
     *
     * Use For: Button Event
     */
    public void onTeamA_addPoints(View view) {
        switch (view.getId()) {
            case (R.id.teamA_add3):
                teamA_score += 3;
            case (R.id.teamA_add2):
                teamA_score += 2;
            case (R.id.teamA_add1):
                teamA_score += 1;
        }
        displayForTeamA(teamA_score);
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
}

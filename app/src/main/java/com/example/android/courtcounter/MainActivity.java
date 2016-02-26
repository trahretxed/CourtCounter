package com.example.android.courtcounter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int teamAPoints = 0;
    int teamBPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 3 pts.
     */
    public void threePointsTeamA(View view) {
        teamAPoints = teamAPoints + 3;
        displayForTeamA(teamAPoints);
    }

    /**
     * 2 pts.
     */
    public void twoPointsTeamA(View view) {
        teamAPoints = teamAPoints + 2;
        displayForTeamA(teamAPoints);
    }

    /**
     * 1 pts.
     */
    public void freeThrowTeamA(View view) {
        teamAPoints = teamAPoints + 1;
        displayForTeamA(teamAPoints);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * 3 pts.
     */
    public void threePointsTeamB(View view) {
        teamBPoints = teamBPoints + 3;
        displayForTeamB(teamBPoints);
    }

    /**
     * 2 pts.
     */
    public void twoPointsTeamB(View view) {
        teamBPoints = teamBPoints + 2;
        displayForTeamB(teamBPoints);
    }

    /**
     * 1 pts.
     */
    public void freeThrowTeamB(View view) {
        teamBPoints = teamBPoints + 1;
        displayForTeamB(teamBPoints);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Good game!";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        teamAPoints = 0;
        teamBPoints = 0;
        displayForTeamA(teamAPoints);
        displayForTeamB(teamBPoints);
    }
}

package com.example.android.lolscoretracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int killsTeamA = 0;
    int killsTeamB = 0;
    int assistsTeamA = 0;
    int assistsTeamB = 0;
    int towersTeamA = 0;
    int towersTeamB = 0;
    int drakesTeamA = 0;
    int drakesTeamB = 0;
    TextView victoryMsg;
    LinearLayout mainView;

    static final String KILLS_FOR_A = "killsA";
    static final String KILLS_FOR_B = "killsB";
    static final String ASSISTS_FOR_A = "assistsA";
    static final String ASSISTS_FOR_B = "assistsB";
    static final String TOWERS_FOR_A = "towersA";
    static final String TOWERS_FOR_B = "towersB";
    static final String DRAKES_FOR_A = "drakesA";
    static final String DRAKES_FOR_B = "drakesB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        victoryMsg = (TextView) findViewById(R.id.victory_msg);
        mainView = (LinearLayout) findViewById(R.id.main_view);
        victoryMsg.setVisibility(View.GONE);
    }

    /**
     * Victory for Team A.
     */
    public void victoryForTeamA(View v) {
        victoryMsg.setText("Team Red\nVictory!");
        victoryMsg.setVisibility(View.VISIBLE);
        victoryMsg.setTextColor(getResources().getColor(R.color.redBtnTxtColor));
        mainView.setVisibility(View.GONE);
    }

    /**
     * Victory for Team B.
     */
    public void victoryForTeamB(View v) {
        victoryMsg.setText("Team Blue\nVictory!");
        victoryMsg.setVisibility(View.VISIBLE);
        victoryMsg.setTextColor(getResources().getColor(R.color.blueBtnStrokeColor));
        mainView.setVisibility(View.GONE);
    }

    /**
     * Increase the kills for Team A by 1.
     */
    public void addKillsForTeamA(View v) {
        killsTeamA = killsTeamA + 1;
        displayKillsTeamA(killsTeamA);
    }

    /**
     * Increase the assists for Team A by 1.
     */
    public void addAssistsForTeamA(View v) {
        assistsTeamA = assistsTeamA + 1;
        displayAssistsTeamA(assistsTeamA);
    }

    /**
     * Increase the towers for Team A by 1.
     */
    public void addTowersForTeamA(View v) {
        towersTeamA = towersTeamA + 1;
        displayTowersTeamA(towersTeamA);
    }

    /**
     * Increase the drakes for Team A by 1.
     */
    public void addDrakesForTeamA(View v) {
        drakesTeamA = drakesTeamA + 1;
        displayDrakesTeamA(drakesTeamA);
    }

    /**
     * Increase the kills for Team B by 1.
     */
    public void addKillsForTeamB(View v) {
        killsTeamB = killsTeamB + 1;
        displayKillsTeamB(killsTeamB);
    }

    /**
     * Increase the assists for Team B by 1.
     */
    public void addAssistsForTeamB(View v) {
        assistsTeamB = assistsTeamB + 1;
        displayAssistsTeamB(assistsTeamB);
    }

    /**
     * Increase the towers for Team B by 1.
     */
    public void addTowersForTeamB(View v) {
        towersTeamB = towersTeamB + 1;
        displayTowersTeamB(towersTeamB);
    }

    /**
     * Increase the drakes for Team B by 1.
     */
    public void addDrakesForTeamB(View v) {
        drakesTeamB = drakesTeamB + 1;
        displayDrakesTeamB(drakesTeamB);
    }

    /**
     * Reset score.
     */
    public void reset(View v) {
        killsTeamA = 0;
        killsTeamB = 0;
        assistsTeamA = 0;
        assistsTeamB = 0;
        towersTeamA = 0;
        towersTeamB = 0;
        drakesTeamA = 0;
        drakesTeamB = 0;
        displayKillsTeamA(killsTeamA);
        displayKillsTeamB(killsTeamB);
        displayAssistsTeamA(assistsTeamA);
        displayAssistsTeamB(assistsTeamB);
        displayTowersTeamA(towersTeamA);
        displayTowersTeamB(towersTeamB);
        displayDrakesTeamA(drakesTeamA);
        displayDrakesTeamB(drakesTeamB);
        victoryMsg.setVisibility(View.GONE);
        mainView.setVisibility(View.VISIBLE);
    }

    /**
     * Displays the kills for Team A.
     */
    public void displayKillsTeamA(int score) {
        TextView killsView = (TextView) findViewById(R.id.team_a_kills);
        killsView.setText(String.valueOf(score));
    }

    /**
     * Displays the assists for Team A.
     */
    public void displayAssistsTeamA(int score) {
        TextView assistsView = (TextView) findViewById(R.id.team_a_assists);
        assistsView.setText(String.valueOf(score));
    }

    /**
     * Displays the towers for Team A.
     */
    public void displayTowersTeamA(int score) {
        TextView towersView = (TextView) findViewById(R.id.team_a_towers);
        towersView.setText(String.valueOf(score));
    }

    /**
     * Displays the drakes for Team A.
     */
    public void displayDrakesTeamA(int score) {
        TextView drakesView = (TextView) findViewById(R.id.team_a_drakes);
        drakesView.setText(String.valueOf(score));
    }

    /**
     * Displays the kills for Team B.
     */
    public void displayKillsTeamB(int score) {
        TextView killsView = (TextView) findViewById(R.id.team_b_kills);
        killsView.setText(String.valueOf(score));
    }

    /**
     * Displays the assists for Team B.
     */
    public void displayAssistsTeamB(int score) {
        TextView assistsView = (TextView) findViewById(R.id.team_b_assists);
        assistsView.setText(String.valueOf(score));
    }

    /**
     * Displays the towers for Team B.
     */
    public void displayTowersTeamB(int score) {
        TextView towersView = (TextView) findViewById(R.id.team_b_towers);
        towersView.setText(String.valueOf(score));
    }

    /**
     * Displays the drakes for Team B.
     */
    public void displayDrakesTeamB(int score) {
        TextView drakesView = (TextView) findViewById(R.id.team_b_drakes);
        drakesView.setText(String.valueOf(score));
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putInt(KILLS_FOR_A, killsTeamA);
        savedInstanceState.putInt(KILLS_FOR_B, killsTeamB);
        savedInstanceState.putInt(ASSISTS_FOR_A, assistsTeamA);
        savedInstanceState.putInt(ASSISTS_FOR_B, assistsTeamB);
        savedInstanceState.putInt(TOWERS_FOR_A, towersTeamA);
        savedInstanceState.putInt(TOWERS_FOR_B, towersTeamB);
        savedInstanceState.putInt(DRAKES_FOR_A, drakesTeamA);
        savedInstanceState.putInt(DRAKES_FOR_B, drakesTeamB);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        killsTeamA = savedInstanceState.getInt(KILLS_FOR_A);
        killsTeamB = savedInstanceState.getInt(KILLS_FOR_B);
        assistsTeamA = savedInstanceState.getInt(ASSISTS_FOR_A);
        assistsTeamB = savedInstanceState.getInt(ASSISTS_FOR_B);
        towersTeamA = savedInstanceState.getInt(TOWERS_FOR_A);
        towersTeamB = savedInstanceState.getInt(TOWERS_FOR_B);
        drakesTeamA = savedInstanceState.getInt(DRAKES_FOR_A);


        displayKillsTeamA(killsTeamA);
        displayKillsTeamB(killsTeamB);
        displayAssistsTeamA(assistsTeamA);
        displayAssistsTeamB(assistsTeamB);
        displayTowersTeamA(towersTeamA);
        displayTowersTeamB(towersTeamB);
        displayDrakesTeamA(drakesTeamA);
        displayDrakesTeamB(drakesTeamB);
    }
}
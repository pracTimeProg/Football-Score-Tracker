package com.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAGoalCounter = 0;
    int teamAFoulCounter = 0;
    int teamBGoalCounter = 0;
    int teamBFoulCounter = 0;

    final int GOAL = 1;
    final int FOUL = 1;
    final int RESET_VALUE = 0;

    TextView teamAGoalCountTextView;
    TextView teamAFoulCountTextView;
    TextView teamBGoalCountTextView;
    TextView teamBFoulCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamAGoalCountTextView = findViewById(R.id.team_a_goal_counter);
        teamAFoulCountTextView = findViewById(R.id.team_a_foul_counter);
        teamBGoalCountTextView = findViewById(R.id.team_b_goal_counter);
        teamBFoulCountTextView = findViewById(R.id.team_b_foul_counter);

        teamAGoalCountTextView.setText(String.valueOf(RESET_VALUE));
        teamBGoalCountTextView.setText(String.valueOf(RESET_VALUE));
        teamAFoulCountTextView.setText(String.valueOf(RESET_VALUE));
        teamBFoulCountTextView.setText(String.valueOf(RESET_VALUE));
    }//End onCreate

    public void teamAGoalIncrease(View view){
        teamAGoalCounter = teamAGoalCounter + GOAL;
        teamAGoalCountTextView.setText(String.valueOf(teamAGoalCounter));
    }//End teamAGoalIncrease

    public void teamAFoulIncrease(View view){
        teamAFoulCounter = teamAFoulCounter + FOUL;
        teamAFoulCountTextView.setText(String.valueOf(teamAFoulCounter));
    }//End teamAFoulIncrease

    public void teamBGoalIncrease(View view){
        teamBGoalCounter = teamBGoalCounter + GOAL;
        teamBGoalCountTextView.setText(String.valueOf(teamBGoalCounter));
    }//End teamBGoalIncrease

    public void teamBFoulIncrease(View view){
        teamBFoulCounter = teamBFoulCounter + FOUL;
        teamBFoulCountTextView.setText(String.valueOf(teamBFoulCounter));
    }//End teamBFoulIncrease

    public void resetAll(View view){

        teamAGoalCounter = RESET_VALUE;
        teamAFoulCounter = RESET_VALUE;
        teamBGoalCounter = RESET_VALUE;
        teamBFoulCounter = RESET_VALUE;

        teamAGoalCountTextView.setText(String.valueOf(teamAGoalCounter));
        teamAFoulCountTextView.setText(String.valueOf(teamAFoulCounter));
        teamBGoalCountTextView.setText(String.valueOf(teamBGoalCounter));
        teamBFoulCountTextView.setText(String.valueOf(teamBFoulCounter));
    }//End resetAll

}//End Main

package com.example.quizgame;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        linkViews();
    }

    /* Defines how UI components are shown on the screen and what happens when player
       interacts with them. */
    private void linkViews() {
        /* Part 2: Clicking on the "Play again" button should let the player restart the game. */
    }

    /* Restarts game! */
    private void restartGame()  {
        CurrentGame currentGame = CurrentGame.get();
        currentGame.currentState = null;
        currentGame.currentQuestionInd = -1;
        currentGame.currentQuestions = new ArrayList<>();
        currentGame.currentAnswer = "";
        // Create intent to transition to Title screen
        Intent mainActivityIntent = new Intent(this, MainActivity.class);
        startActivity(mainActivityIntent);
    }

}
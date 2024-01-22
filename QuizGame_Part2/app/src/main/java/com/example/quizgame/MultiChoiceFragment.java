package com.example.quizgame;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MultiChoiceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_multi_choice, container, false);
        linkViews(view);
        return view;
    }

    /* Defines how UI components are shown and what happens when player interacts with them. */
    private void linkViews(View view) {
        /* Part 2: Display the current question and the possible choices the player can choose from. */
        QuestionInfo currentQuestion = CurrentGame.getCurrentQuestion();
        String currentQuestionString = currentQuestion.question;
        String choice1 = currentQuestion.choices.get(0);
        String choice2 = currentQuestion.choices.get(1);
        String choice3 = currentQuestion.choices.get(2);
        String choice4 = currentQuestion.choices.get(3);

    }

}
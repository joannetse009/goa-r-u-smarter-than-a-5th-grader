package com.example.quizgame;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class QNAFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_q_n_a, container, false);
        linkViews(view);
        return view;
    }

    /* Defines how UI components are shown and what happens when player interacts with them. */
    private void linkViews(View view) {
        /* Part 2: Display the current question. */
        QuestionInfo currentQuestion = CurrentGame.getCurrentQuestion();
        String currentQuestionString = currentQuestion.question;

        TextView qnaQuestion = view.findViewById(R.id.qna_question);
        qnaQuestion.setText(currentQuestionString);
    }

}
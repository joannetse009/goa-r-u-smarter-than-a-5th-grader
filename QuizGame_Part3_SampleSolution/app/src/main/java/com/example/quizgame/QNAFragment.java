package com.example.quizgame;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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
        QuestionInfo currentQuestion = CurrentGame.getCurrentQuestion();
        String currentQuestionString = currentQuestion.question;

        TextView qnaQuestion = view.findViewById(R.id.qna_question);
        qnaQuestion.setText(currentQuestionString);

        /* Part 3: Capture the answer that the player entered.
         *         Assign to currentGame.currentAnswer to let the game know
         *         this is the player's current answer to the given question. */
        CurrentGame currentGame = CurrentGame.get();
        EditText textAnswer = view.findViewById(R.id.qna_answer);
        textAnswer.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                currentGame.currentAnswer = editable.toString();
                System.out.println(String.format("CURRENT ANSWER: %s", currentGame.currentAnswer));
            }
        });
    }

}
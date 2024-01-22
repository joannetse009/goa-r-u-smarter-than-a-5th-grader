package com.example.quizgame;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageQNAFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image_q_n_a, container, false);
        linkViews(view);
        return view;
    }

    /* Defines how UI components are shown and what happens when player interacts with them. */
    private void linkViews(View view) {
        /* Part 2: Display the current question and the image the question is referring to. */
        QuestionInfo currentQuestion = CurrentGame.getCurrentQuestion();
        String currentQuestionString = currentQuestion.question;
        int currentQuestionImg = currentQuestion.img;

        TextView imageQNAQuestion = view.findViewById(R.id.image_qna_question);
        ImageView questionImage = view.findViewById(R.id.question_image);
        imageQNAQuestion.setText(currentQuestionString);
        questionImage.setImageDrawable(ContextCompat.getDrawable(getActivity(), currentQuestionImg));
    }

}
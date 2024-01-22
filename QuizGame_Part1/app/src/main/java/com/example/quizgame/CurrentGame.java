package com.example.quizgame;

import java.util.ArrayList;

public class CurrentGame {

    ArrayList<QuestionInfo> currentQuestions = new ArrayList<>();
    int currentQuestionInd = -1;
    String currentAnswer = "";
    GameState currentState = null;

    private static CurrentGame instance = null;
    public static CurrentGame get() {
        if (instance == null) {
            instance = new CurrentGame();
        }
        return instance;
    }

    /* Load a set of 3 hard-coded questions for the demo game,
    *  used during implementation and debugging of the game's features. */
    public static void loadDemoGameQuestions() {
        if (instance == null) {
            return;
        }
        instance.currentQuestions = new ArrayList<>();
        QuestionInfo question1 = new QuestionInfo("1 + 1 = ?",
                "",
                new String[]{"2", "two"});
        question1.category = "Grade 1 Math";
        QuestionInfo question2 = new QuestionInfo("What is the capital of Canada?",
                "",
                new String[] {"Ottawa"},
                "Toronto",
                "Ottawa",
                "Yukon",
                "Vancouver");
        question2.category = "Grade 3 Geography";
        QuestionInfo question3 = new QuestionInfo("Which is the fastest bird on foot?",
                "",
                new String[] {"ostrich"},
                R.drawable.birds);
        question3.category = "Grade 5 Science";
        instance.currentQuestions.add(question1);
        instance.currentQuestions.add(question2);
        instance.currentQuestions.add(question3);
    }

}

package com.example.bug_venture_app;

import android.app.Activity;

public class QuizQuestionSit extends Activity{
    private int id;
    private String question;

    public QuizQuestionSit(String ques) {
        question = ques;
    }

    public QuizQuestionSit() {
        id = 0;
        question = "";
    }

    public String getQuestion() {
        return question;
    }


    public void setId(int i) {
        id = i;
    }
    public void setQuestion(String ques) {
        question = ques;
    }


}

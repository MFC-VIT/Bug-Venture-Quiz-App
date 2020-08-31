package com.example.bug_venture_app;

import android.app.Activity;

public class QuizQuestionSit extends Activity{
    private int id;
    private String question;
    private String answer;

    public QuizQuestionSit(String q, String ans) {
        question = q;
        answer = ans;
    }

    public QuizQuestionSit() {
        id = 0;
        question = "";
        answer = "";
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setId(int i) {
        id = i;
    }
    public void setQuestion(String q1) {
        question = q1;
    }

    public void setAnswer(String ans1) {
        answer = ans1;
    }
}

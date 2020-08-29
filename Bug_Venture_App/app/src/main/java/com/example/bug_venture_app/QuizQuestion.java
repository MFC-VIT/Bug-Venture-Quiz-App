package com.example.bug_venture_app;

import android.app.Activity;

public class QuizQuestion extends Activity{
    private int id;
    private String question;
    private String opt_a;
    private String opt_b;
    private String opt_c;
    private String opt_d;
    private String answer;

    public QuizQuestion(String q, String oa, String ob, String oc, String od, String ans) {

        question = q;
        opt_a = oa;
        opt_b = ob;
        opt_c = oc;
        opt_d = od;
        answer = ans;
    }

    public QuizQuestion() {
        id = 0;
        question = "";
        opt_a = "";
        opt_b = "";
        opt_c = "";
        opt_d = "";
        answer = "";
    }

    public String getQuestion() {
        return question;
    }

    public String getOptA() {
        return opt_a;
    }

    public String getOptB() {
        return opt_b;
    }

    public String getOptC() {
        return opt_c;
    }

    public String getOptD() {
        return opt_d;
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

    public void setOptA(String o1) {
        opt_a = o1;
    }

    public void setOptB(String o2) {
        opt_b = o2;
    }

    public void setOptC(String o3) {
        opt_c = o3;
    }

    public void setOptD(String o4) {
        opt_d = o4;
    }

    public void setAnswer(String ans) {
        answer = ans;
    }

}

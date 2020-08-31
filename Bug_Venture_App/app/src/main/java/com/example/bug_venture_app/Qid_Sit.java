package com.example.bug_venture_app;

import android.app.Activity;

public class Qid_Sit extends Activity{
    static int qid_s;

    public Qid_Sit() {
        qid_s = 0;
    }

    static int getQid_s() {
        return qid_s;
    }

    static void updateLeft() {
        qid_s = 2 * qid_s + 1;
    }

    static void updateRight() {
        qid_s = 2 * qid_s + 2;
    }
}

package com.example.bug_venture_app;

import android.app.Activity;

public class QidStoreDebug extends Activity{
    static int q_id;

    public QidStoreDebug() {
        q_id = 0;
    }
    static int getQ_id() {
        return q_id;
    }

    static void updateQ_id() {
        q_id = q_id + 1;
    }
}

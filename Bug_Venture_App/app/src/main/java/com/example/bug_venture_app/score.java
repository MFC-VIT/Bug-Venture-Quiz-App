package com.example.bug_venture_app;

import android.app.Activity;

public class score extends Activity{
    static int total;

    public score() {
        total = 0;
    }

    static int getTotal() {
        return total;
    }

    static void increment() {
        total += 1;
    }

}

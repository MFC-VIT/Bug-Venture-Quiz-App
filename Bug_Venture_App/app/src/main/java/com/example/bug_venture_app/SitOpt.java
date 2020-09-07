package com.example.bug_venture_app;

import android.app.Activity;

public class SitOpt extends Activity{
    private int id;
    private String option1;
    private String option2;

    public SitOpt(String op1, String op2)
    {
        option1 = op1;
        option2 = op2;
    }

    public SitOpt()
    {
        id = 0;
        option2 = "";
        option1 = "";
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setId(int i) {
        id = i;
    }

    public void setOption1(String op1) {
        option1 = op1;
    }

    public void setOption2(String op2) {
        option2 = op2;
    }

}

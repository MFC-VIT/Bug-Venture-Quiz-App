package com.example.bug_venture_app;

import android.app.Activity;

public class sit_abv_opt_ques extends Activity{
    private int id;
    private String display;

    public sit_abv_opt_ques(String d){
        display = d;
    }

    public sit_abv_opt_ques(){
        id = 0;
        display = "";
    }

    public String getDisplay() {
        return display;
    }

    public void setId(int i){
        id = i;
    }

    public void setDisplay(String d){
        display = d;
    }
}

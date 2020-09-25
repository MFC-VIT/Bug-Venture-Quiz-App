package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.bug_venture_app.Main4Activity.player_sequence;
import static com.example.bug_venture_app.Main4Activity.qid_sit;
import static com.example.bug_venture_app.Main4Activity.total_time;

public class MajorChoice extends AppCompatActivity {

    Button next, back;
    String select;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major_choice);

        next = findViewById(R.id.button11);
        back = findViewById(R.id.button10);
        select = "";

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(select.equals(""))
                {
                    Toast.makeText(MajorChoice.this, "Please select a character before going forward", Toast.LENGTH_SHORT).show();
                }
                else if (select.equals("dete"))
                {
                    qid_sit.updateLeft();
                    Intent intent = new Intent(MajorChoice.this, Debug_question.class);
                    startActivity(intent);
                }
                else if(select.equals("army")){
                    qid_sit.updateRight();
                    Intent intent = new Intent(MajorChoice.this, Debug_question.class);
                    startActivity(intent);
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select = "";
                Intent intent = new Intent(MajorChoice.this, army_description.class);
                startActivity(intent);
            }
        });
    }




    @Override
    public void onBackPressed(){
        Toast.makeText(this,"You cannot go back!",Toast.LENGTH_SHORT).show();
    }


    public void on_click_army(View view) {
        select = "army";
    }

    public void on_click_dete(View view) {
        select = "dete";
    }
}
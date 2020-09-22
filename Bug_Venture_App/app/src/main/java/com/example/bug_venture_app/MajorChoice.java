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

    Button detective, soldier, next;
    String select;

    TextView textviewtime;

    ProgressBar mProgressBarChoice;
    int progress_status_choice=0;

    CountDownTimer countDownTimer_Choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major_choice);

        detective = findViewById(R.id.button10);
        soldier = findViewById(R.id.button11);
        next = findViewById(R.id.button12);

        textviewtime = (TextView) findViewById(R.id.time_choice);

        mProgressBarChoice=findViewById(R.id.progressbarchoice);
        mProgressBarChoice.setProgress(progress_status_choice);


        select = "";

        detective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select = "detective";
                detective.setBackgroundResource(R.drawable.yes_selected);
                soldier.setBackgroundResource(R.drawable.yes_not_select);
            }
        });

        soldier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soldier.setBackgroundResource(R.drawable.yes_selected);
                detective.setBackgroundResource(R.drawable.yes_not_select);
                select = "soldier";
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(select.equals("detective")) {
                    qid_sit.updateLeft();
                    Intent intent = new Intent(MajorChoice.this, Debug_question.class);
                    countDownTimer_Choice.cancel();
                    startActivity(intent);
                }
                else if (select.equals("soldier")) {
                    qid_sit.updateRight();
                    Intent intent = new Intent(MajorChoice.this, Debug_question.class);
                    countDownTimer_Choice.cancel();
                    startActivity(intent);
                }
                else if (select.equals("")) {
                    Toast.makeText(MajorChoice.this, "Please select a role before continuing", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();

        countDownTimer_Choice = new CountDownTimer(60500,1000) {
            @Override
            public void onTick(long l) {
                long time_in_minutes=(l/1000)/60;
                long time_in_seconds=(l/1000)%60;

                if (time_in_seconds < (long) 10) {
                    String time="0"+time_in_minutes+":0"+time_in_seconds;
                    textviewtime.setText(time);
                } else {
                    String time="0"+time_in_minutes+":"+time_in_seconds;
                    textviewtime.setText(time);
                }

                total_time = total_time + 1;
                progress_status_choice++;
                mProgressBarChoice.setProgress((int)(progress_status_choice*100/(60000/1000)));
            }

            @Override
            public void onFinish() {
                if (select.equals("")) { // BY this if the user has given the wrong answer or not given any answer then he will be out
                    Intent intent = new Intent(MajorChoice.this, Time_up.class);
                    countDownTimer_Choice.cancel();
                    startActivity(intent);
                } else {
                    if(select.equals("detective")) {
                        Intent intent = new Intent(MajorChoice.this, Debug_question.class);
                        player_sequence.add(0);
                        qid_sit.updateLeft();
                        countDownTimer_Choice.cancel();
                        startActivity(intent);
                    }

                    else if (select.equals("soldier")) {
                        Intent intent = new Intent(MajorChoice.this, Debug_question.class);
                        player_sequence.add(1);
                        qid_sit.updateRight();
                        countDownTimer_Choice.cancel();
                        startActivity(intent);
                    }
                }

                progress_status_choice++;
                mProgressBarChoice.setProgress(100);
            }
        }.start();

        }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"You cannot go back!",Toast.LENGTH_SHORT).show();
    }

}
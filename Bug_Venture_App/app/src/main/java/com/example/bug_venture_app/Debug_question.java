package com.example.bug_venture_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import static com.example.bug_venture_app.Main4Activity.correct_sequence;
import static com.example.bug_venture_app.Main4Activity.player_sequence;
import static com.example.bug_venture_app.Main4Activity.qidStoreDebug;
import static com.example.bug_venture_app.Main4Activity.total_time;

public class Debug_question extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    Button next;
    TextView textView2, question, q_no;
    RadioButton rd5, rd6, rd7, rd8;
    String select;

    ProgressBar progressBar;
    int progress_status = 0;

    CountDownTimer countDownTimer;
    QuizQuestion current_question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug_question);
        Log.d(TAG, "onCreate: Debug");

        next = (Button) findViewById(R.id.button6);
        textView2 = (TextView) findViewById(R.id.time_deb);
        rd5 = (RadioButton) findViewById(R.id.radioButton5);
        rd6 = (RadioButton) findViewById(R.id.radioButton6);
        rd7 = (RadioButton) findViewById(R.id.radioButton7);
        rd8 = (RadioButton) findViewById(R.id.radioButton8);
        question = (TextView) findViewById(R.id.textView7);
        q_no = (TextView) findViewById(R.id.textView);
        select = "";

        progressBar = findViewById(R.id.progressbar);
        progressBar.setProgress(progress_status);

        if(qidStoreDebug.getQ_id() == 3) {
            boolean flag = false;
            for(int i = 0; i < 3; i++) {
                if(correct_sequence.get(i) == player_sequence.get(i)) {
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                Intent intent = new Intent(Debug_question.this, Final_Activity.class);
                startActivity(intent);
                finish();
            }
            else {
                Intent intent = new Intent(Debug_question.this, completed.class);
                startActivity(intent);
                finish();
            }

        }

        current_question = Main4Activity.list.get(qidStoreDebug.getQ_id());
        q_no.setText("Question " + (qidStoreDebug.getQ_id() + 1));

        updateQueAndOptions();
    }

    @Override
    protected void onStart() {
        super.onStart();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (select.equals("")) {
                    Toast.makeText(Debug_question.this, "Please enter something before clicking next", Toast.LENGTH_SHORT).show();
                }
                else if (select.equals(current_question.getAnswer())) {
                    if(qidStoreDebug.getQ_id() == 0) {
                        Intent intent = new Intent(Debug_question.this, Twist.class);
                        qidStoreDebug.updateQ_id();
                        countDownTimer.cancel();
                        startActivity(intent);
                    }
                    else {
                        Intent intent = new Intent(Debug_question.this, Situation_Ques.class);
                        qidStoreDebug.updateQ_id();
                        countDownTimer.cancel();
                        startActivity(intent);
                    }
                } else {
                    Intent intent = new Intent(Debug_question.this, Time_up.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

        Log.d(TAG, "onStart: Debug");

    }

    @Override
    protected void onResume() {
        super.onResume();

        countDownTimer = new CountDownTimer(60500, 1000) {
            @Override
            public void onTick(long l) {
                long time_in_minutes=(l/1000)/60;
                long time_in_seconds=(l/1000)%60;

                if (time_in_seconds < (long) 10) {
                    String time="0"+time_in_minutes+":0"+time_in_seconds;
                    textView2.setText(time);
                } else {
                    String time="0"+time_in_minutes+":"+time_in_seconds;
                    textView2.setText(time);
                }

                total_time = total_time + 1;
                progress_status++;
                progressBar.setProgress((int)(progress_status*100/(60000/1000)));
            }

            @Override
            public void onFinish() {
                // Also in place of rsAmount.getText.toString() => Change it according to the answer given or not also if given what was given
                if (select.equals("")) { // BY this if the user has given the wrong answer or not given any answer then he will be out
                    Intent intent = new Intent(Debug_question.this, Time_up.class); // Here change the activity name for the newQuestion
                    startActivity(intent);
                } else {
                    if(select.equals(current_question.getAnswer())) {
                        Intent intent = new Intent(Debug_question.this, Situation_Ques.class);
                        qidStoreDebug.updateQ_id();
                        countDownTimer.cancel();
                        startActivity(intent);
                    }
                    else {
                        Intent intent = new Intent(Debug_question.this, Time_up.class);
                        startActivity(intent);
                        finish();
                    }

                    progress_status++;
                    progressBar.setProgress(100);
                }
            }
        }.start();

        Log.d(TAG, "onResume: Debug");
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "You cannot go back!", Toast.LENGTH_SHORT).show();
    }

    public void on_click(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton5:
                if (checked)
                    select = rd5.getText().toString();
                rd5.setBackgroundResource(R.drawable.option_debug);
                rd6.setBackgroundResource(R.drawable.option_debug1);
                rd7.setBackgroundResource(R.drawable.option_debug1);
                rd8.setBackgroundResource(R.drawable.option_debug1);
                break;
            case R.id.radioButton6:
                if (checked)
                    select = rd6.getText().toString();
                rd6.setBackgroundResource(R.drawable.option_debug);
                rd5.setBackgroundResource(R.drawable.option_debug1);
                rd7.setBackgroundResource(R.drawable.option_debug1);
                rd8.setBackgroundResource(R.drawable.option_debug1);
                break;
            case R.id.radioButton7:
                if (checked)
                    select = rd7.getText().toString();
                rd7.setBackgroundResource(R.drawable.option_debug);
                rd6.setBackgroundResource(R.drawable.option_debug1);
                rd5.setBackgroundResource(R.drawable.option_debug1);
                rd8.setBackgroundResource(R.drawable.option_debug1);
                break;
            case R.id.radioButton8:
                if (checked)
                    select = rd8.getText().toString();
                rd8.setBackgroundResource(R.drawable.option_debug);
                rd6.setBackgroundResource(R.drawable.option_debug1);
                rd7.setBackgroundResource(R.drawable.option_debug1);
                rd5.setBackgroundResource(R.drawable.option_debug1);
                break;
        }
    }

    public void updateQueAndOptions() {
        question.setText(current_question.getQuestion());
        rd5.setText(current_question.getOptA());
        rd6.setText(current_question.getOptB());
        rd7.setText(current_question.getOptC());
        rd8.setText(current_question.getOptD());
    }
}

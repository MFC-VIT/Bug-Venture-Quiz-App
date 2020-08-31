package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.bug_venture_app.Main4Activity.player_sequence;
import static com.example.bug_venture_app.Main4Activity.qidStoreDebug;
import static com.example.bug_venture_app.Main4Activity.qid_sit;
import static com.example.bug_venture_app.Main4Activity.total_time;

public class Situation_Ques extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    Button submit, yes, no;
    TextView textView2, question;
    String selected;

    QuizQuestionSit current_q;
    CountDownTimer countDownTimer_Sit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation__ques);

        Log.d(TAG, "onCreate: Situation");

        submit = (Button) findViewById(R.id.button5);
        yes = (Button) findViewById(R.id.button3);
        no = (Button) findViewById(R.id.button8);
        textView2 = (TextView) findViewById(R.id.time_sit);
        question = (TextView) findViewById(R.id.textView6);
        selected = "";

        current_q = Main4Activity.list_sit.get(qid_sit.getQid_s());
        updateQ();

    }

    @Override
    public void onStart() {
        super.onStart();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected.equals("Yes")) {
                    Intent intent = new Intent(Situation_Ques.this, Debug_question.class);
                    player_sequence.add(0);
                    qid_sit.updateLeft();
                    countDownTimer_Sit.cancel();
                    startActivity(intent);
                }

                else if (selected.equals("No")) {
                    Intent intent = new Intent(Situation_Ques.this, Debug_question.class);
                    player_sequence.add(1);
                    qid_sit.updateRight();
                    countDownTimer_Sit.cancel();
                    startActivity(intent);
                }
            }
        });

        Log.d(TAG, "onStart: Situation");
    }

    @Override
    protected void onResume() {
        super.onResume();

        countDownTimer_Sit = new CountDownTimer(30500,1000) {
            @Override
            public void onTick(long l) {
                if(l/1000<(long)11){
                    textView2.setTextColor(Color.RED);
                }
                else if(l/1000<(long)21){
                    textView2.setTextColor(Color.rgb(255,204,0));
                }
                if(l/1000<(long)10){
                    textView2.setText("0"+String.valueOf(l/1000)+"s");
                }
                else{
                    textView2.setText(String.valueOf(l/1000)+"s");
                }

                total_time = total_time + 1;
            }

            @Override
            public void onFinish() {
                if (selected.equals("")) { // BY this if the user has given the wrong answer or not given any answer then he will be out
                    Intent intent = new Intent(Situation_Ques.this, Time_up.class); // Here change the activity name for the newQuestion
                    startActivity(intent);
                } else {
                    if(selected.equals("Yes")) {
                        Intent intent = new Intent(Situation_Ques.this, Debug_question.class);
                        player_sequence.add(0);
                        qid_sit.updateLeft();
                        countDownTimer_Sit.cancel();
                        startActivity(intent);
                    }

                    else if (selected.equals("No")) {
                        Intent intent = new Intent(Situation_Ques.this, Debug_question.class);
                        player_sequence.add(1);
                        qid_sit.updateRight();
                        countDownTimer_Sit.cancel();
                        startActivity(intent);
                    }
                }
            }
        }.start();

        Log.d(TAG, "onResume: Situation");
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"Sorry Not Possible!",Toast.LENGTH_SHORT).show();
    }

    public void on_click_bt1(View view) {
        yes.setBackgroundResource(R.drawable.yes_selected);
        no.setBackgroundResource(R.drawable.yes_not_select);

        selected = "Yes";
    }

    public void on_click_bt2(View view) {
        no.setBackgroundResource(R.drawable.yes_selected);
        yes.setBackgroundResource(R.drawable.yes_not_select);

        selected = "No";
    }

    public void updateQ() {
        question.setText(current_q.getQuestion());
    }

}

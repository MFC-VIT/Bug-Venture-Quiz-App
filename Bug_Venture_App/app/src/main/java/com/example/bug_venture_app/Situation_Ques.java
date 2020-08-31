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

import static com.example.bug_venture_app.Main4Activity.qidStoreDebug;
import static com.example.bug_venture_app.Main4Activity.qid_sit;

public class Situation_Ques extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    Button submit, yes, no;
    RadioButton rd1, rd2, rd3, rd4;
    TextView textView2, question;
    String selected, temp;

    QuizQuestionSit current_q;

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
        temp = "";

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
                    qid_sit.updateLeft();
                    startActivity(intent);
                }

                else if (selected.equals("No")) {
                    Intent intent = new Intent(Situation_Ques.this, Debug_question.class);
                    qid_sit.updateRight();
                    startActivity(intent);
                }
            }
        });

        Log.d(TAG, "onStart: Situation");
    }

    @Override
    protected void onResume() {
        super.onResume();

        new CountDownTimer(30500,1000) {
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

            }

            @Override
            public void onFinish() {
                // Also in place of rsAmount.getText.toString() => Change it according to the answer given or not also if given what was given
                if(temp.equals("") || rd1.getText().toString().equals("0")){ // BY this if the user has  not given any answer then he will be out
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class); // Here change the activity name for the newQuestion
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"You Answered a question",Toast.LENGTH_SHORT).show(); // If user answered the correct one direct it to the next question by using intent again
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

package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Debug_question extends AppCompatActivity {

    Button next;
    TextView textView2;
    RadioButton rd5, rd6, rd7, rd8;
    String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        public void random_code_generator(){
            String generatedString = RandomStringUtils.randomAlphanumeric(10);
            Toast.makeText(getApplicationContext(),generatedString,Toast.LENGTH_SHORT).show();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug_question);

        next = (Button) findViewById(R.id.button6);
        textView2 = (TextView) findViewById(R.id.time_deb);
        rd5 = (RadioButton) findViewById(R.id.radioButton5);
        rd6 = (RadioButton) findViewById(R.id.radioButton6);
        rd7 = (RadioButton) findViewById(R.id.radioButton7);
        rd8 = (RadioButton) findViewById(R.id.radioButton8);

        temp = "";

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Debug_question.this, Situation_Ques.class);
                startActivity(intent);
            }
        });
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
                if(temp.equals("") || rd5.getText().toString().equals("0")){ // BY this if the user has given the wrong answer or not given any answer then he will be out
                    Intent intent = new Intent(Debug_question.this, Time_up.class); // Here change the activity name for the newQuestion
                    intent.putExtra("name","Your BugVenture Ends Here.");
                    startActivity(intent);
                }
                else{
                    random_code_generator(); // If user answered the correct one direct it to the next question by using intent again
                }
            }
        }.start();
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this,"Sorry Not Possible!",Toast.LENGTH_SHORT).show();
    }

    public void on_click(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.radioButton5:
                if(checked)
                    rd5.setTextColor(Color.GREEN);
                break;
            case R.id.radioButton6:
                if(checked)
                    rd6.setTextColor(Color.GREEN);
                break;
            case R.id.radioButton7:
                if(checked)
                    rd7.setTextColor(Color.GREEN);
                break;
            case R.id.radioButton8:
                if(checked)
                    rd8.setTextColor(Color.GREEN);
                break;
        }

    }
}

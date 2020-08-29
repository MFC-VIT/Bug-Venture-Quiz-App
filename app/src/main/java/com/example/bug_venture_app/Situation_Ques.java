package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Situation_Ques extends AppCompatActivity {

    Button submit,rd1, rd2, rd3, rd4;
    TextView question;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation__ques);

        rd1 = (Button) findViewById(R.id.button3);
        rd2 = (Button) findViewById(R.id.button8);

        submit = (Button) findViewById(R.id.button5);
        textView2 = (TextView) findViewById(R.id.time_sit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Situation_Ques.this, Debug_question.class);
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
                // Also in place of rsAmount.getText.toString() => Change it according to the aswer given or not also if given what was given
                if(rd1.getText().toString().equals("") || rd1.getText().toString().equals("0")){ // BY this if the user has  not given any answer then he will be out
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class); // Here change the activity name for the newQuestion 
                    intent.putExtra("name","Your BugVenture Ends Here.");
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"You Answered a question",Toast.LENGTH_SHORT).show(); // If user answered the correct one direct it to the next question by using intent again
                }
            }
        }.start();
    }
    
    @Override
    public void onBackPressed(){
        Toast.makeText(this,"Sorry Not Possible!",Toast.LENGTH_SHORT).show();
    }

    public void on_click_situation(View view) {
        boolean checked = ((Button) view).isPressed();
        switch (view.getId()){
            case R.id.button3:
                if(checked)
                    rd1.setTextColor(Color.GREEN);
                break;
            case R.id.button8:
                if(checked)
                    rd2.setTextColor(Color.GREEN);
                break;
        }
    }


}

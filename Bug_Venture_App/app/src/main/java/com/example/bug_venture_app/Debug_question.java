package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Debug_question extends AppCompatActivity {

    Button next;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug_question);

        next = (Button) findViewById(R.id.button6);
        textView2 = (TextView) findViewById(R.id.textView2);

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
                // Also in place of rsAmount.getText.toString() => Change it according to the aswer given or not also if given what was given
                if(rsAmount.getText().toString().equals("") || rsAmount.getText().toString().equals("0")){ // BY this if the user has given the wrong answer or not given any answer then he will be out
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
}

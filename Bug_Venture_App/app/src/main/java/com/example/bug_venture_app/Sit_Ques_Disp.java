package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.bug_venture_app.Main4Activity.qid_sit;

public class Sit_Ques_Disp extends AppCompatActivity {

    TextView Situation_question;
    Button next;
    QuizQuestionSit question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sit__ques__disp);

        Situation_question = findViewById(R.id.textView14);
        next = findViewById(R.id.button9);

        question = Main4Activity.list_sit.get(qid_sit.getQid_s());

        Situation_question.setText(question.getQuestion());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sit_Ques_Disp.this, Situation_Ques.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this, "You cannot go back!", Toast.LENGTH_SHORT).show();
    }
}
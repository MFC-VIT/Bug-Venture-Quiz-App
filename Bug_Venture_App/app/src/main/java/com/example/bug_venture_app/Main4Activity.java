package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    Button play;
    FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authStateListener;
    static List<QuizQuestion> list;
    static QidStoreDebug qidStoreDebug;
    Question_Helper question_helper;
    static List<SitOpt> list_op_sit;
    Sit_Opt_Helper sit_opt_helper;
    static List<QuizQuestionSit> list_sit;
    static Qid_Sit qid_sit;
    Ques_Sit_Helper ques_sit_helper;
    static List<Integer> correct_sequence;
    static List<Integer> player_sequence;
    static long total_time;
    static int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        correct_sequence = new ArrayList<Integer>();
        player_sequence = new ArrayList<Integer>();
        init_sequence();
        total_time = 0;
        score = 0;

        question_helper = new Question_Helper(this);
        question_helper.getWritableDatabase();

        if(question_helper.getAllOfTheQuestions().size() == 0) {
            question_helper.allQuestion();
        }

        if(qidStoreDebug.getQ_id() == 0) {
            list = question_helper.getAllOfTheQuestions();
            Collections.shuffle(list);
        }

        sit_opt_helper = new Sit_Opt_Helper(this);
        sit_opt_helper.getWritableDatabase();

        if(sit_opt_helper.getAllOfTheQuestions().size() == 0) {
            sit_opt_helper.allQuestion();
        }

        ques_sit_helper = new Ques_Sit_Helper(this);
        ques_sit_helper.getWritableDatabase();

        if(ques_sit_helper.getAllOfTheQuestions().size() == 0) {
            ques_sit_helper.allQuestion();
        }

        if(qid_sit.getQid_s() == 0) {
            list_op_sit = sit_opt_helper.getAllOfTheQuestions();
            list_sit = ques_sit_helper.getAllOfTheQuestions();
        }



        play = (Button) findViewById(R.id.button4);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this, Debug_question.class);
                startActivity(intent);
            }
        });

        Log.d(TAG, "onCreate: Instructions");
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"You cannot go back!",Toast.LENGTH_SHORT).show();
    }

    public void init_sequence() {
        correct_sequence.add(1);
        correct_sequence.add(0);
        correct_sequence.add(1);
    }
}

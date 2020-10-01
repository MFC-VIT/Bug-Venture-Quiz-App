package com.example.bug_venture_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Random;

import static com.example.bug_venture_app.Main3Activity.e_Mail;
import static com.example.bug_venture_app.Main4Activity.score;
import static com.example.bug_venture_app.Main4Activity.total_time;

public class Final_Activity extends AppCompatActivity {

    TextView email, unique_generated, time;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_);

        email = findViewById(R.id.textView4);
        unique_generated = findViewById(R.id.textView5);
        time = findViewById(R.id.textView12);

        email.setText(e_Mail);
        if(score == 10)
        {
            unique_generated.setText("3s6a46k5a" + score);
        }
        else {
            unique_generated.setText("3s6a46k5a" + "0" + score);
        }

        long minutes = total_time / 60;
        long seconds = total_time % 60;
        time.setText(minutes + " min " + seconds + " sec");


        FirebaseAuth.getInstance().signOut();
        Toast.makeText(Final_Activity.this, "You have been logged out successfully.", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"You cannot go back!",Toast.LENGTH_SHORT).show();
    }
}

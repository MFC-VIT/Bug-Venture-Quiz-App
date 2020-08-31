package com.example.bug_venture_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Random;

import static com.example.bug_venture_app.Main3Activity.e_Mail;
import static com.example.bug_venture_app.Main4Activity.total_time;

public class Final_Activity extends AppCompatActivity {

    TextView email, unique_generated, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_);

        email = (TextView) findViewById(R.id.textView4);
        unique_generated = (TextView) findViewById(R.id.textView5);
        time = (TextView) findViewById(R.id.textView12);

        email.setText(e_Mail);
        unique_generated.setText("Winner");
        time.setText(Long.toString(total_time) + " seconds");


        FirebaseAuth.getInstance().signOut();
        Toast.makeText(Final_Activity.this, "You have been logged out successfully.", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"You cannot go back!",Toast.LENGTH_SHORT).show();
    }
}

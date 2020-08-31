package com.example.bug_venture_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Random;

import static com.example.bug_venture_app.Main3Activity.e_Mail;
import static com.example.bug_venture_app.Main4Activity.total_time;

public class completed extends AppCompatActivity {

    TextView e_mail, u_code, time;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed);

        FirebaseAuth.getInstance().signOut();
        Toast.makeText(completed.this, "You have been logged out successfully.", Toast.LENGTH_SHORT).show();

        e_mail = (TextView) findViewById(R.id.textView8);
        u_code = (TextView) findViewById(R.id.textView10);
        time = (TextView) findViewById(R.id.textView11);

        e_mail.setText(e_Mail);
        random_code_generator();
        time.setText(Long.toString(total_time) + " seconds");
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void random_code_generator() {
        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = 8;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        u_code.setText(generatedString);

        // Just Add like generatedString+textview(score).toString() for addition of the score here
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"You cannot go back!",Toast.LENGTH_SHORT).show();
    }
}

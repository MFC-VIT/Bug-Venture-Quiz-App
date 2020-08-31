package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class completed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed);

        FirebaseAuth.getInstance().signOut();
        Toast.makeText(completed.this, "You have been logged out successfully.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"You cannot go back!",Toast.LENGTH_SHORT).show();
    }
}

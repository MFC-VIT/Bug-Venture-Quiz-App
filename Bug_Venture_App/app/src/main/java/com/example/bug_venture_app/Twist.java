package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Twist extends AppCompatActivity {

    Button nxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twist);

        nxt = (Button) findViewById(R.id.button7);

        nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Twist.this, Situation_Ques.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"Sorry Not Possible!",Toast.LENGTH_SHORT).show();
    }
}

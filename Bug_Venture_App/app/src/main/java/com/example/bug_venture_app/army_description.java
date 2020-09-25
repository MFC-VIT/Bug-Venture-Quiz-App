package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class army_description extends AppCompatActivity {

    Button next, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_army_description);

        next = findViewById(R.id.button16);
        back = findViewById(R.id.button15);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(army_description.this, MajorChoice.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(army_description.this, detective_description.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"Use the button above to go back.",Toast.LENGTH_SHORT).show();
    }
}
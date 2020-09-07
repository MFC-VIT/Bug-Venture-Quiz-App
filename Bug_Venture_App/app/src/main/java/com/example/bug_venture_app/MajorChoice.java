package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.bug_venture_app.Main4Activity.qid_sit;

public class MajorChoice extends AppCompatActivity {

    Button detective, soldier, next;
    String select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major_choice);

        detective = findViewById(R.id.button10);
        soldier = findViewById(R.id.button11);
        next = findViewById(R.id.button12);
        select = "";

        detective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select = "detective";
            }
        });

        soldier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                select = "soldier";
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(select.equals("detective")) {
                    qid_sit.updateLeft();
                    Intent intent = new Intent(MajorChoice.this, Debug_question.class);
                    startActivity(intent);
                }
                else if (select.equals("soldier")) {
                    qid_sit.updateRight();
                    Intent intent = new Intent(MajorChoice.this, Debug_question.class);
                    startActivity(intent);
                }
                else if (select.equals("")) {
                    Toast.makeText(MajorChoice.this, "Please select a role before continuing", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"You cannot go back!",Toast.LENGTH_SHORT).show();
    }
}
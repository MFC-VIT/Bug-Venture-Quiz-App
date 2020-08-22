package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Situation_Ques extends AppCompatActivity {

    Button submit;
    RadioButton rd1, rd2, rd3, rd4;
    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_situation__ques);

        rd1 = (RadioButton) findViewById(R.id.radioButton);
        rd2 = (RadioButton) findViewById(R.id.radioButton2);
        rd3 = (RadioButton) findViewById(R.id.radioButton3);
        rd4 = (RadioButton) findViewById(R.id.radioButton4);

        submit = (Button) findViewById(R.id.button5);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Situation_Ques.this, Debug_question.class);
                startActivity(intent);
            }
        });
    }
    
    @Override
    public void onBackPressed(){
        Toast.makeText(this,"Sorry Not Possible!",Toast.LENGTH_SHORT).show();
    }

    public void on_click_radio(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.radioButton:
                if(checked)
                    rd1.setTextColor(Color.GREEN);
                break;
            case R.id.radioButton2:
                if(checked)
                    rd2.setTextColor(Color.GREEN);
                break;
            case R.id.radioButton3:
                if(checked)
                    rd3.setTextColor(Color.GREEN);
            case R.id.radioButton4:
                if(checked)
                    rd4.setTextColor(Color.GREEN);
                break;
        }
    }


}

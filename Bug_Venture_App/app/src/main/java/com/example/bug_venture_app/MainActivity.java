package com.example.bug_venture_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button) findViewById(R.id.button1);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go_to_activity2();
            }
        });
    }

    public void go_to_activity2() {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
}

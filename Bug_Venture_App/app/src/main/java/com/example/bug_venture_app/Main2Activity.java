package com.example.bug_venture_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {

    Button sign_up_but;
    EditText email_id, password;
    TextView to_login;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        auth = FirebaseAuth.getInstance();
        email_id = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);

        sign_up_but = (Button) findViewById(R.id.button);
        to_login = (TextView) findViewById(R.id.textView3);

        sign_up_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = email_id.getText().toString();
                String pass = password.getText().toString();

                if(email.isEmpty()){
                    email_id.setError("Please enter the email id");
                    email_id.requestFocus();
                }

                else if(pass.isEmpty()){
                    password.setError("Please enter your password");
                    password.requestFocus();
                }

                else{
                    auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(Main2Activity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(Main2Activity.this, "SignUp Unsuccessful, Please Try Again", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                startActivity(new Intent(Main2Activity.this, Main4Activity.class));
                            }
                        }
                    });
                }
            }
        });

        to_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

    }
}

package com.example.bug_venture_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Main3Activity extends AppCompatActivity {

    Button login;
    EditText email_ID, password;
    FirebaseAuth authorization;
    static String e_Mail;
    private FirebaseAuth.AuthStateListener auth_state_listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        login = (Button) findViewById(R.id.button2);
        email_ID = (EditText) findViewById(R.id.editText3);
        password = (EditText) findViewById(R.id.editText4);

        authorization = FirebaseAuth.getInstance();

        auth_state_listener = firebaseAuth -> {
            FirebaseUser m_firebaseUser = authorization.getCurrentUser();
            if(m_firebaseUser != null){
                Toast.makeText(Main3Activity.this, "You are logged in", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intent);
            }
            else{
                Toast.makeText(Main3Activity.this, "Please login", Toast.LENGTH_SHORT).show();
            }
        };

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = email_ID.getText().toString();
                String pass = password.getText().toString();
                e_Mail = email;

                if(email.isEmpty()){
                    email_ID.setError("Please enter the email id");
                    email_ID.requestFocus();
                }

                else if(pass.isEmpty()){
                    password.setError("Please enter your password");
                    password.requestFocus();
                }

                else{
                    authorization.signInWithEmailAndPassword(email, pass).addOnCompleteListener(Main3Activity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(Main3Activity.this, "Login error please login again", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                                startActivity(intent);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(this,"Sorry Not Possible!",Toast.LENGTH_SHORT).show();
    }

}

package com.project.mobiledevprojectdibs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterInterface extends AppCompatActivity {
    Button goLogin;
    ImageButton backButton;
    EditText mName, mEmail, mUsername, mPassword, mPhoneNum;
    FirebaseAuth firebaseAuth;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_interface);

        mName = findViewById(R.id.nameTextBox);
        mEmail = findViewById(R.id.emailTextBox);
        mUsername = findViewById(R.id.userTextBox);
        mPassword = findViewById(R.id.passwordTextBox);
        mPhoneNum = findViewById(R.id.phoneTextBox);
        firebaseAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);

        goLogin = findViewById(R.id.submitButton);
        if(firebaseAuth.getCurrentUser() != null){
            Intent intent = new Intent(RegisterInterface.this,Home.class);
            startActivity(intent);
            finish();
        }
        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailDets = mEmail.getText().toString().trim();
                String passwordDets = mPassword.getText().toString().trim();

                if(TextUtils.isEmpty(emailDets)){
                    mEmail.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(passwordDets)){
                    mPassword.setError("Password is Required");
                    return;
                }
                if(passwordDets.length() <6 ){
                    mPassword.setError("Password must be at least 6 characters");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                firebaseAuth.createUserWithEmailAndPassword(emailDets,passwordDets).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(RegisterInterface.this,"Register Successful", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(RegisterInterface.this,Login.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(RegisterInterface.this, "Register Failed. " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });


        backButton = (ImageButton) findViewById(R.id.closeButtonRegister);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterInterface.this,Login.class);
                startActivity(intent);
            }
        });
    }
}
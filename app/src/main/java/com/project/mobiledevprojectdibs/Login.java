package com.project.mobiledevprojectdibs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    TextView register, forgotpass;
    Button goHome;
    EditText mEmailLogin, mPasswordLogin;
    ProgressBar progressBar;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEmailLogin = findViewById(R.id.emailLogInTextBox);
        mPasswordLogin = findViewById(R.id.passwordTextBox);
        progressBar = findViewById(R.id.progressBar);
        firebaseAuth = FirebaseAuth.getInstance();




        register = findViewById(R.id.createAcc);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,RegisterInterface.class);
                startActivity(intent);
            }
        });

        forgotpass = (TextView)findViewById(R.id.forgotPass);
        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,ForgotPass1.class);
                startActivity(intent);
            }
        });

        goHome = (Button)findViewById(R.id.loginButton);
        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailDets = mEmailLogin.getText().toString().trim();
                String passwordDets = mPasswordLogin.getText().toString().trim();

                if(TextUtils.isEmpty(emailDets)){
                    mEmailLogin.setError("Email is Required");
                    return;
                }
                if(TextUtils.isEmpty(passwordDets)){
                    mPasswordLogin.setError("Password is Required");
                    return;
                }
                if(passwordDets.length() <6 ){
                    mPasswordLogin.setError("Password must be at least 6 characters");
                    return;
                }


                //authenticate

                firebaseAuth.signInWithEmailAndPassword(emailDets,passwordDets).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Intent intent = new Intent(Login.this,Home.class);
                            startActivity(intent);

                        }
                        else{
                            Toast.makeText(Login.this, "Error! Information entered is incorrect", Toast.LENGTH_SHORT).show();

                        }
                    }
                });



            }
        });

    }
}
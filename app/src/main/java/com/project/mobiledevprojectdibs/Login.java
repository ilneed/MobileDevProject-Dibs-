package com.project.mobiledevprojectdibs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;

public class Login extends AppCompatActivity {
    TextView register, forgotpass;
    private Button goHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register = (TextView)findViewById(R.id.createAcc);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Register.class);
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
                Intent intent = new Intent(Login.this,Home.class);
                startActivity(intent);
            }
        });
    }
}
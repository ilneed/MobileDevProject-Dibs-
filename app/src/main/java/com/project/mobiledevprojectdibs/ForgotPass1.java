package com.project.mobiledevprojectdibs;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageButton;

public class ForgotPass1 extends AppCompatActivity {

    private Button forgotpass2;
    ImageButton backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass1);
        forgotpass2 = (Button)findViewById(R.id.sendCodeButton);
        forgotpass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgotPass1.this,ForgotPass2.class);
                startActivity(intent);
            }
        });
        backbutton = (ImageButton)findViewById(R.id.closeFPP1Button);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgotPass1.this,Login.class);
                startActivity(intent);
            }
        });
    }
}
package com.project.mobiledevprojectdibs;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;

public class ForgotPass1 extends AppCompatActivity {

    private Button forgotpass2;
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
    }
}
package com.project.mobiledevprojectdibs;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.ImageButton;

public class ForgotPass2 extends AppCompatActivity {
    private Button goLogin;
    ImageButton backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass2);
        goLogin = (Button)findViewById(R.id.saveButton);
        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgotPass2.this,Login.class);
                startActivity(intent);
            }
        });
        backbutton = (ImageButton)findViewById(R.id.closeFPP2Button);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgotPass2.this,Login.class);
                startActivity(intent);
            }
        });
    }
}
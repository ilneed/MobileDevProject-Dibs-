package com.project.mobiledevprojectdibs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class RegisterInterface extends AppCompatActivity {
    public static final String TAG = "TAG";
    Button goLogin;
    ImageButton backButton;
    EditText mName, mEmail, mUsername, mPassword, mPhoneNum;
    FirebaseAuth firebaseAuth;
    ProgressBar progressBar;
    FirebaseFirestore fStore;
    String userID;
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

        fStore = FirebaseFirestore.getInstance();

        goLogin = findViewById(R.id.submitButton);
        if(firebaseAuth.getCurrentUser() != null){
            Intent intent = new Intent(RegisterInterface.this,Home.class);
            startActivity(intent);
            finish();
        }
        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String emailDets = mEmail.getText().toString().trim();
                final String passwordDets = mPassword.getText().toString().trim();
                final String nameDets = mName.getText().toString();
                final String phoneDets = mPhoneNum.getText().toString();
                final String usernameDets = mUsername.getText().toString();

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
                            userID = firebaseAuth.getCurrentUser().getUid();
                          DocumentReference documentReference = fStore.collection("users").document(userID);

                           Map<String,Object> user = new HashMap<>();
                           user.put("fullName", nameDets);
                           user.put("email", emailDets);
                          user.put("phoneNo", phoneDets);
                           user.put("username", usernameDets);
                          user.put("password",passwordDets);

                          //insert to cloud
                           documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                              @Override
                               public void onSuccess(Void aVoid) {
                                  Log.d(TAG, "onSuccess: user Profile is created");
                               }
                           });

                            

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
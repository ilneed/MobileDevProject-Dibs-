package com.project.mobiledevprojectdibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class EditMyProduct extends AppCompatActivity {
    private Spinner spinnerCatergory;
    private Button goPost;
    private ImageButton closeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_my_product);
        spinnerCatergory = findViewById(R.id.spinnerCatergory);

        String[] categories = getResources().getStringArray(R.array.category);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, categories);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCatergory.setAdapter(adapter);

        goPost = (Button)findViewById(R.id.postButton);
        goPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditMyProduct.this,Home.class);
                startActivity(intent);
            }
        });
        closeButton = (ImageButton) findViewById(R.id.closeButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EditMyProduct.this,Home.class);
                startActivity(intent);
            }
        });




    }
}
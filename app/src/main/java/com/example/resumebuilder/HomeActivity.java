package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    AppCompatButton createBtn,createBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
            createBtn = findViewById(R.id.createBtn);
            createBtn2 =findViewById(R.id.resumeBtn2);

            createBtn.setOnClickListener(v -> {

                Intent intent = new Intent(HomeActivity.this, DataActivity.class);
                startActivity(intent);

            });

            createBtn2.setOnClickListener(view -> {
                Intent intent = new Intent(HomeActivity.this, DataActivity.class);
                startActivity(intent);
            });
    }
}
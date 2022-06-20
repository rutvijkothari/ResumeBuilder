package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class DataActivity extends AppCompatActivity {

    AppCompatButton submitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        initView();
    }

    private void initView() {
        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(view -> {
            sendData();
        });
    }

    private void sendData() {
        Intent intent = new Intent(DataActivity.this, DisplayActivity.class);
        startActivity(intent);
    }
}
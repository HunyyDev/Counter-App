package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnIncreaseCounter;
    private TextView tvCounter;
    private int Counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();
    }

    private void initiate() {
        btnIncreaseCounter = findViewById(R.id.btnIncreaseCounter);
        btnIncreaseCounter.setOnClickListener(this);
        tvCounter = findViewById(R.id.tvCounter);
    }

    private void increaseCounter(){
        ++Counter;
    }

    @Override
    public void onClick(View v) {
        increaseCounter();
        String castedCounterToInt = Counter + "";
        tvCounter.setText(castedCounterToInt);
    }
}
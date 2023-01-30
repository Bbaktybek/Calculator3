package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_second);
        MaterialButton redButton = findViewById(R.id.red_button);
        redButton.setOnClickListener(view -> {
            finishAffinity();
        });
        TextView textView = findViewById(R.id.current_policies);
        textView.setText(getIntent().getStringExtra("Kay"));
    }
}

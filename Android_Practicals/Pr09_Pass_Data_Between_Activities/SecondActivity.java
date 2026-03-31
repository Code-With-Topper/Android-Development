package com.example.passdata;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView displayText = findViewById(R.id.displayText);
        String username = getIntent().getStringExtra("USERNAME");
        String password = getIntent().getStringExtra("PASSWORD");

        displayText.setText("Username: " + username + "\nPassword: " + password);
    }
}

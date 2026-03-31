package com.example.arithmeticop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        resultText = findViewById(R.id.resultText);

        findViewById(R.id.addButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { performOperation("+"); }
        });

        findViewById(R.id.subtractButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { performOperation("-"); }
        });

        findViewById(R.id.multiplyButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { performOperation("*"); }
        });

        findViewById(R.id.divideButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { performOperation("/"); }
        });
    }

    private void performOperation(String operator) {
        String num1Str = number1.getText().toString();
        String num2Str = number2.getText().toString();

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double result = 0;

        switch (operator) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/":
                if (num2 != 0) { result = num1 / num2; }
                else {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                    return;
                }
                break;
        }
        resultText.setText("Result: " + result);
    }
}

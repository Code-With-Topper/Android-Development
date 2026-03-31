package com.example.checkboxapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox checkbox1, checkbox2, checkbox3;
    Button showSelectedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);
        showSelectedButton = findViewById(R.id.showSelectedButton);

        showSelectedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder selectedOptions = new StringBuilder("Selected: ");
                if (checkbox1.isChecked()) selectedOptions.append(checkbox1.getText()).append(" ");
                if (checkbox2.isChecked()) selectedOptions.append(checkbox2.getText()).append(" ");
                if (checkbox3.isChecked()) selectedOptions.append(checkbox3.getText()).append(" ");

                if (selectedOptions.toString().equals("Selected: ")) {
                    Toast.makeText(MainActivity.this, "No option selected", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, selectedOptions.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

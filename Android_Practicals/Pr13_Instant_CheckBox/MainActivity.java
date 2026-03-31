package com.example.instantcheckbox;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox checkbox1, checkbox2, checkbox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox1 = findViewById(R.id.checkbox1);
        checkbox2 = findViewById(R.id.checkbox2);
        checkbox3 = findViewById(R.id.checkbox3);

        checkbox1.setOnClickListener(checkboxListener);
        checkbox2.setOnClickListener(checkboxListener);
        checkbox3.setOnClickListener(checkboxListener);
    }

    View.OnClickListener checkboxListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            CheckBox checkBox = (CheckBox) v;
            String message = checkBox.isChecked() ? "Checked: " : "Unchecked: ";
            Toast.makeText(MainActivity.this, message + checkBox.getText(), Toast.LENGTH_SHORT).show();
        }
    };
}

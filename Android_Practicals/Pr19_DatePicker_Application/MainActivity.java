package com.example.datepickerapp;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    DatePicker datePicker;
    TextView dateText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        dateText = findViewById(R.id.dateText);

        datePicker.init(
            datePicker.getYear(),
            datePicker.getMonth(),
            datePicker.getDayOfMonth(),
            new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    dateText.setText("Selected Date: " + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                }
            }
        );
    }
}

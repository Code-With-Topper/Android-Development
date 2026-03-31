package com.example.databasedemo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button updateButton = findViewById(R.id.updateButton);
        updateButton.setOnClickListener(v -> {
            SQLiteDatabase db = openOrCreateDatabase("school.db", MODE_PRIVATE, null);
            ContentValues values = new ContentValues();
            values.put("marks", 90);
            int rows = db.update("student", values, "id = ?", new String[]{"1"});
            if (rows > 0) {
                Toast.makeText(MainActivity.this, "Data Updated Successfully!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "No record found with ID=1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.databasedemo;

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

        Button deleteButton = findViewById(R.id.deleteButton);
        deleteButton.setOnClickListener(v -> {
            SQLiteDatabase db = openOrCreateDatabase("school.db", MODE_PRIVATE, null);
            int rows = db.delete("student", "id = ?", new String[]{"1"});
            if (rows > 0) {
                Toast.makeText(MainActivity.this, "Data Deleted Successfully!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "No record found with ID=1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.databasedemo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase db = openOrCreateDatabase("school.db", MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(id INTEGER PRIMARY KEY, name TEXT, surname TEXT, marks INTEGER);");

        ContentValues values = new ContentValues();
        values.put("name", "John");
        values.put("surname", "Doe");
        values.put("marks", 85);
        db.insert("student", null, values);

        Toast.makeText(this, "Data Inserted Successfully!", Toast.LENGTH_SHORT).show();
    }
}

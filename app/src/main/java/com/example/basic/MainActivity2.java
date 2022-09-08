package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name;
    static String nm = "pranav";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String val = getIntent().getStringExtra("abcd");
        Log.d("hello",val);

        name = findViewById(R.id.name);

        name.setText(val);
    }
}
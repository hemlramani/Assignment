package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);

        Intent intent1 = getIntent();
        String name = intent1.getStringExtra("nm");
        String email = intent1.getStringExtra("eml");

        txt1.setText(name);
        txt2.setText(email);


    }
}
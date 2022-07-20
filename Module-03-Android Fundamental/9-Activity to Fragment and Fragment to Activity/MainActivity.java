package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btnfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfragment = findViewById(R.id.btnfragment);

        btnfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BlankFragment blankFragment = new BlankFragment();
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentfirst,blankFragment).commit();
            }
        });


    }
}
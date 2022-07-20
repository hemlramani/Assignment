package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtname,edtemail;
    Button btndatapass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtname= findViewById(R.id.edtname);
        edtemail = findViewById(R.id.edtemail);
        btndatapass = findViewById(R.id.btndatapass);



        btndatapass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = edtname.getText().toString();
                String email = edtemail.getText().toString();


                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("nm",name);
                intent.putExtra("eml",email);
                startActivity(intent);
            }
        });







    }
}
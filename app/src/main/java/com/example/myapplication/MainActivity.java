package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView title, enter_name;
    EditText Name;
    Button Start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.title);
        enter_name = findViewById(R.id.enter_name);
        Name = findViewById(R.id.Name);
        Start = findViewById(R.id.Start_bt);
        Name.setText(getIntent().getStringExtra("name"));


        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(enter_name.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"You need to enter you name!", Toast.LENGTH_SHORT);
                }
                else {
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, Q1.class);
                    intent.putExtra("name",Name.getText().toString());

                    startActivity(intent);
                }
            }
        });
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Feedback extends AppCompatActivity {
    TextView a, b, Name, score;
    int f;

    Button next, Finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        Name = findViewById(R.id.Name);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        score = findViewById(R.id.Score);
        next = findViewById(R.id.New);
        Finish = findViewById(R.id.Finish);
        Name.setText(getIntent().getStringExtra("name"));
        int sco = getIntent().getIntExtra("score",f);
        String s = String.valueOf(sco + "/5");
        score.setText(s);

        next.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Feedback.this, MainActivity.class);
                intent.putExtra("name", Name.getText().toString());
                startActivity(intent);
            }
        });
        Finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();


            }
        });

    }
}
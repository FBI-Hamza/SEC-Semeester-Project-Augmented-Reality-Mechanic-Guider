package com.mechanicguider.mechanicguider;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetectMechanicalIssues extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detect_mechanical_issues);

        TextView btn1 = findViewById(R.id.DetectMechanicalIssueButton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetectMechanicalIssues.this,MechanicalIssueDetail.class));
            }
        });
    }
}
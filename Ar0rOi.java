package com.mechanicguider.mechanicguider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ar0rOi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar0r_oi);

        TextView btn1 = findViewById(R.id.ARButton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ar0rOi.this,AugmentedTraining.class));
            }
        });

        TextView btn2 = findViewById(R.id.ObjectIdentifierButton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ar0rOi.this,ObjectIdentifierDashboard.class));
            }
        });
    }
}
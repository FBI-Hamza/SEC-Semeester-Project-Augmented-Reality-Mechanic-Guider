package com.mechanicguider.mechanicguider;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ObjectIdentifierDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_identifier_dashboard);

        TextView btn1 = findViewById(R.id.DetectVehiceTypeButton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ObjectIdentifierDashboard.this,DetectVehicleTye.class));
            }
        });

        TextView btn2 = findViewById(R.id.DetectVehiclePartButton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ObjectIdentifierDashboard.this,DetectVehiclePart.class));
            }
        });

        TextView btn3 = findViewById(R.id.DetectMechanicalFaultButton);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ObjectIdentifierDashboard.this,DetectMechanicalIssues.class));
            }
        });

        TextView btn4 = findViewById(R.id.DetectExactPaintColorButton);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ObjectIdentifierDashboard.this,DetectPaintColor.class));
            }
        });

        TextView btn5 = findViewById(R.id.Select2DModeButton);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ObjectIdentifierDashboard.this,Select2DMode.class));
            }
        });

        TextView btn6 = findViewById(R.id.Select3DModeButton);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ObjectIdentifierDashboard.this,Select3DMode.class));
            }
        });

        TextView btn7 = findViewById(R.id.Edit2DModeButton);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ObjectIdentifierDashboard.this,edit2DMode.class));
            }
        });

        TextView btn8 = findViewById(R.id.Edit3DModeButton);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ObjectIdentifierDashboard.this,Edit3DMode.class));
            }
        });
    }
}
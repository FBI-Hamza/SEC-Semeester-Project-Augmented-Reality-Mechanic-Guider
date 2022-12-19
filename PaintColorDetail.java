package com.mechanicguider.mechanicguider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PaintColorDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint_color_detail);

        TextView btn1 = findViewById(R.id.VehicleColorDetailsBackButton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaintColorDetail.this,ObjectIdentifierDashboard.class));
            }
        });
    }
}
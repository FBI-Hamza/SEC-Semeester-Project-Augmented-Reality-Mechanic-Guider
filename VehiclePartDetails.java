package com.mechanicguider.mechanicguider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VehiclePartDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_part_details);

        TextView btn1 = findViewById(R.id.VehiclePartDetailsBackButton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VehiclePartDetails.this,ObjectIdentifierDashboard.class));
            }
        });
    }
}
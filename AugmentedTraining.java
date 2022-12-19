package com.mechanicguider.mechanicguider;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AugmentedTraining extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_augmented_training);

        TextView btn1 = findViewById(R.id.AddAProblemFileButton);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AugmentedTraining.this,AddProblemFile.class));
            }
        });

         TextView btn2 = findViewById(R.id.AddASolutionFileButton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AugmentedTraining.this,AddSolutionFile.class));
            }
        });

        TextView btn3 = findViewById(R.id.SearchInternetForDataset);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AugmentedTraining.this,SearchInternetForDataset.class));
            }
        });

        TextView btn4 = findViewById(R.id.ViewProblemListButton);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AugmentedTraining.this,ViewProblemList.class));
            }
        });

        TextView btn5 = findViewById(R.id.ViewSolutionListButton);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AugmentedTraining.this,ViewSolutionList.class));
            }
        });

        TextView btn6 = findViewById(R.id.ContactManufacturerButton);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AugmentedTraining.this,ContactManufacturer.class));
            }
        });
    }
}
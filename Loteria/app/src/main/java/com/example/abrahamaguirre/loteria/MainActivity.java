package com.example.abrahamaguirre.loteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9, ib10, ib11, ib12, ib13, ib14, ib15, ib16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib1 = findViewById(R.id.ib1);
        ib2 = findViewById(R.id.ib2);
        ib3 = findViewById(R.id.ib3);
        ib4 = findViewById(R.id.ib4);
        ib5 = findViewById(R.id.ib5);
        ib6 = findViewById(R.id.ib6);
        ib7 = findViewById(R.id.ib7);
        ib8 = findViewById(R.id.ib8);
        ib9 = findViewById(R.id.ib9);
        ib10 = findViewById(R.id.ib10);
        ib11 = findViewById(R.id.ib11);
        ib12 = findViewById(R.id.ib12);
        ib13 = findViewById(R.id.ib13);
        ib14 = findViewById(R.id.ib14);
        ib15 = findViewById(R.id.ib15);
        ib16 = findViewById(R.id.ib16);


        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib1.setImageResource(R.drawable.frijolito);
            }
        });


        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib2.setImageResource(R.drawable.frijolito);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib3.setImageResource(R.drawable.frijolito);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib4.setImageResource(R.drawable.frijolito);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib5.setImageResource(R.drawable.frijolito);
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib6.setImageResource(R.drawable.frijolito);
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib7.setImageResource(R.drawable.frijolito);
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib8.setImageResource(R.drawable.frijolito);
            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib9.setImageResource(R.drawable.frijolito);
            }
        });
        ib10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib10.setImageResource(R.drawable.frijolito);
            }
        });
        ib11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib11.setImageResource(R.drawable.frijolito);
            }
        });
        ib12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib12.setImageResource(R.drawable.frijolito);
            }
        });
        ib13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib13.setImageResource(R.drawable.frijolito);
            }
        });
        ib14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib14.setImageResource(R.drawable.frijolito);
            }
        });
        ib15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib15.setImageResource(R.drawable.frijolito);
            }
        });
        ib16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ib16.setImageResource(R.drawable.frijolito);
            }
        });
    }
}
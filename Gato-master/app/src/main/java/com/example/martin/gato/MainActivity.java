package com.example.martin.gato;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    int turno=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn2 = findViewById(R.id.btn2);
        btn9 = findViewById(R.id.btn9);

        btn1.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button boton= (Button) view;
        if (turno == 0)
        {

            boton.setBackgroundResource(R.drawable.circulo);
            turno=1;
        }
        else {

            boton.setBackgroundResource(R.drawable.equis);
             Drawable r = boton.getBackground();
            btn1 = findViewById(R.id.btn1);
            btn2 = findViewById(R.id.btn2);
            btn3 = findViewById(R.id.btn3);
            if (btn1.getBackground().equals(r) && btn2.getBackground().equals(r) && btn3.getBackground().equals(r))
            {
                Toast.makeText(MainActivity.this,"Eso cabron",Toast.LENGTH_SHORT).show();
                boton.setEnabled(true);
            }

            turno=0;
        }

    }
}

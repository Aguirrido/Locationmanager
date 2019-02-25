package com.example.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button b1,b2,b3,b4,b5,restart;
    TextView n1,n2;
    int turno=0;
    int acomulador;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        restart=findViewById(R.id.b6);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        restart.setOnClickListener(this);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);

    }

    @Override
    public void onClick(View view) {
        int numero = (int) (Math.random() * 9) + 1;
        Button boton=(Button) view;
        turno++;

   acomulador+=numero;

            if(acomulador<=21){

                n1.setText(numero+ "");
                n2.setText(acomulador + "");


            }
        if(acomulador<=21 && turno==5){

            n1.setText(numero+ "");
            n2.setText(acomulador + "");
            Toast.makeText(MainActivity.this,"Ganaste",Toast.LENGTH_SHORT).show();

        }
            else if(acomulador>21){
                n1.setText(numero+ "");
                n2.setText(acomulador + "");
                Toast.makeText(MainActivity.this,"Perdiste",Toast.LENGTH_SHORT).show();
                boton.setEnabled(true);
            }

         switch (boton.getId()) {
             case R.id.b6:
                 numero=0;
                 acomulador=0;
                 turno=0;
                 n1.setText(numero+ "");
                 n2.setText(acomulador + "");
                 break;
         }







    }
}

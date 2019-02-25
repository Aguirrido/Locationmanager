package com.example.abrahamaguirre.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText pant;
    public double operan1, operan2, res;
    int ope;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant = (EditText) findViewById(R.id.caja);
    }

    public void bt1(View v) {
        String cap = pant.getText().toString();
        cap = cap + "1";
        pant.setText(cap);
    }

    public void bt2(View v) {
        String cap = pant.getText().toString();
        cap = cap + "2";
        pant.setText(cap);

    }

    public void bt3(View v) {
        String cap = pant.getText().toString();
        cap = cap + "3";
        pant.setText(cap);

    }

    public void bt4(View v) {
        String cap = pant.getText().toString();
        cap = cap + "4";
        pant.setText(cap);

    }

    public void bt5(View v) {
        String cap = pant.getText().toString();
        cap = cap + "5";
        pant.setText(cap);

    }

    public void bt6(View v) {
        String cap = pant.getText().toString();
        cap = cap + "6";
        pant.setText(cap);

    }

    public void bt7(View v) {
        String cap = pant.getText().toString();
        cap = cap + "7";
        pant.setText(cap);

    }

    public void bt8(View v) {
        String cap = pant.getText().toString();
        cap = cap + "8";
        pant.setText(cap);
    }

    public void bt9(View v) {
        String cap = pant.getText().toString();
        cap = cap + "9";
        pant.setText(cap);
    }

    public void bt0(View v) {
        String cap = pant.getText().toString();
        cap = cap + "0";
        pant.setText(cap);

    }

    public void btpunt(View v) {
        String cap = pant.getText().toString();
        cap = cap + ".";
        pant.setText(cap);
    }

    public void btpar(View v) {
        String cap = pant.getText().toString();
        cap = cap + "( )";
        pant.setText(cap);
    }

    public void suma(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        ;
        pant.setText("");
        ope = 1;
    }

    public void resta(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        ;
        pant.setText("");
        ope = 2;
    }

    public void multiplicacion(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        ;
        pant.setText("");
        ope = 3;
    }

    public void division(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        ;
        pant.setText("");
        ope = 4;
    }

    public void potencia(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        ;
        pant.setText("");
        ope = 5;
    }

    public void porcentaje(View v) {
        try {
            String aux1 = pant.getText().toString();
            operan1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        ;
        pant.setText("");
        ope = 6;
    }
}

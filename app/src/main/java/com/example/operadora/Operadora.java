package com.example.operadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Operadora extends AppCompatActivity {

    private TextView tela;
    private EditText minutos;
    private Spinner operadoras;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minutos=findViewById(R.id.minutos);
        tela=findViewById(R.id.tela);
        operadoras=findViewById(R.id.operadoras);
    }

    public void calcularOperadora(View tf){
        String op = operadoras.getSelectedItem().toString();
        double min = Double.parseDouble(minutos.getText().toString());
        result =(min*60)-5;
        System.out.println(op);

        DecimalFormat d = new DecimalFormat("0.00");

        if (op.equals("OP1")){
            result=result*0.02;
            tela.setText(""+d.format(result));

        }else
        if (op.equals("OP2")){
            result=result*0.025;
            tela.setText(""+d.format(result));


        }else
        if (op.equals("OP3")){
            result=result*0.019;
            tela.setText(""+d.format(result));


        }


    }
}

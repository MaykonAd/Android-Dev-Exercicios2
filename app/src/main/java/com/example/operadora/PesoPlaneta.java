package com.example.operadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class PesoPlaneta extends AppCompatActivity {
    private Spinner planetas;
    private TextView tela;
    private EditText peso;
    String op;
    double ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_planeta);

        planetas=findViewById(R.id.planetas);
        tela=findViewById(R.id.tela);
        peso=findViewById(R.id.peso);
    }
    public void calcular(View tf){
        op=planetas.getSelectedItem().toString();
        ps=Double.parseDouble(peso.getText().toString());
        DecimalFormat d = new DecimalFormat("0.00");

        if (op.equals("Mercúrio")){
        ps=(ps/10)*0.37;
            tela.setText(""+d.format(ps));
        }
        if (op.equals("Vênus")){
            ps=(ps/10)*0.88;
            tela.setText(""+d.format(ps));
        }
        if (op.equals("Marte")){
            ps=(ps/10)*0.38;
            tela.setText(""+d.format(ps));
        }
        if (op.equals("Júpiter")){
            ps=(ps/10)*2.64;
            tela.setText(""+d.format(ps));
        }
        if (op.equals("Saturno")){
            ps=(ps/10)*1.15;
            tela.setText(""+d.format(ps));
        }else
        if (op.equals("Urano")){
            ps=(ps/10)*1.17;
            tela.setText(""+d.format(ps));
        }
    }
}

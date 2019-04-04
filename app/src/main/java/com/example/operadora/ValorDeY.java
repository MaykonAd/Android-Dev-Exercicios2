package com.example.operadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ValorDeY extends AppCompatActivity {
    private TextView tela;
    private EditText x;
    double resultado,valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_de_y);

        tela=findViewById(R.id.tela);
        x=findViewById(R.id.x);

    }

    public void calcular(View tf){
        valor=Double.parseDouble(x.getText().toString());
        DecimalFormat d = new DecimalFormat("0.00");
        resultado=8/(2-valor);

        tela.setText(""+d.format(resultado));
    }
}

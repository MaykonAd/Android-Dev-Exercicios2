package com.example.operadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Avalicao extends AppCompatActivity {

    private TextView tela;
    private EditText av2, av1;
    double result,ava1,ava2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avalicao);
        av1=findViewById(R.id.av1);
        av2=findViewById(R.id.av2);
        tela=findViewById(R.id.tela);

    }

    public void calcular(View tf){
        ava1=Double.parseDouble(av1.getText().toString());
        ava2=Double.parseDouble(av2.getText().toString());
        result=(ava1+ava2)/2;

        if (result >= 7){
            tela.setText("Aprovado");
            System.out.println(result);
        }else if (result >= 4 && result < 7){
            tela.setText("Prova Final");
        }else if (result < 4){
            tela.setText("Reprovado");
       }
    }
}

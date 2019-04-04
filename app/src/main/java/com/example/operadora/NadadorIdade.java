package com.example.operadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NadadorIdade extends AppCompatActivity {
    private EditText idade;
    private TextView tela;
    private double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nadador_idade);

        idade = findViewById(R.id.idade);
        tela = findViewById(R.id.tela);
    }
    public void consultarIdade(View tf){
        result = Double.parseDouble(idade.getText().toString());
        if(result >= 5 && result <=7){
            tela.setText("Infantil A");
        } else if(result >= 8 && result <=10 ){
            tela.setText("Infantil B");
        } else if(result >=11 && result <=13){
            tela.setText("Juvenil A");
        } else if(result >=14 && result <=17){
            tela.setText("Juvenil B");
        } else if(result >=18 && result <= 99){
            tela.setText("Senior");
        }else if(result < 5 || result > 100) {
            tela.setText("Sem permissão para nadar");
        }


    }
}

package com.example.operadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class DescontoCliente extends AppCompatActivity {
    private EditText nome,total;
    private TextView tela;
    private String voga;
    private double mult,result,result2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desconto_cliente);
        nome = findViewById(R.id.nome);
        total = findViewById(R.id.totalCont);
        tela = findViewById(R.id.tela);
    }
    public void consultar(View tf){
        voga = nome.getText().toString();
        mult = Double.parseDouble(total.getText().toString());
        DecimalFormat d = new DecimalFormat("0.00");
        if (voga.startsWith("a")|| voga.startsWith("e")||voga.startsWith("i")||voga.startsWith("o")||voga.startsWith("u")||voga.startsWith("A")||voga.startsWith("E")||voga.startsWith("I")||voga.startsWith("O")||voga.startsWith("U")||voga.startsWith("u")){
            result= mult * 0.7;
            tela.setText("Total a pagar: "+d.format(result));
        }else{
            tela.setText("Poxa nesta semana o desconto não é para seu nome. Total a pagar:"+d.format(mult));


        }



    }
}

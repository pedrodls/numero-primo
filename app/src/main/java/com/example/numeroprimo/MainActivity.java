package com.example.numeroprimo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verificar(View view) {

        Integer numero=0;
        Integer cont = 0;
        EditText caixaNumero = (EditText) findViewById(R.id.edtxtNumero);
        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);

        try{

            numero = Integer.parseInt(caixaNumero.getText()+"");

            for (Integer i=1; i<=numero; i++)
                if(numero%i==0)
                    cont++;

                if (cont==2)
                    txtResultado.setText(numero+" é Primo");
                else
                    txtResultado.setText(numero+" não é Primo");


        }catch (Exception ex){
            Toast.makeText(this, "Preecha o campo", Toast.LENGTH_LONG).show();
        }
    }
}
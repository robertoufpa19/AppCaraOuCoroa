package com.robertocursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);


         buttonVoltar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 // passar dados para a proxima tela
                 int numero = new Random().nextInt(2);

                 if(numero == 0 ){  // cara
                     imageResultado.setImageResource(R.drawable.moeda_cara);
                 }else{  // coroa
                     imageResultado.setImageResource(R.drawable.moeda_coroa);
                 }
             }
         });
    }
}

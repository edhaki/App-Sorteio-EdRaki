package com.campanha.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){
// APP Desenvolvido por Ederson Alves da Silva - Aprendendo sobre Dev.Android com Java!
        TextView texto = findViewById(R.id.textoResultado);

        int x = new Random().nextInt(11);

        texto.setText("Número :" + x);


    }

}
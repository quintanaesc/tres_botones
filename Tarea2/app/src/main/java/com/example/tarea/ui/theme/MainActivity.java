package com.example.tarea.ui.theme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.annotation.Nullable;
//import com.example.tarea.Bolita;
import com.example.tarea.R;

public class MainActivity extends Activity {
    TextView tvTituloPrin, tvDescPrin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        // inicializa la vista
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        tvTituloPrin = findViewById(R.id.tvTituloPrin);
        tvDescPrin = findViewById(R.id.tvDescPrin)  ;
    }

  /*    public void llamarCalculadora(View v){
        Intent i = new Intent(this, CalcuActivity.class);
        startActivity(i);
    }

    public void llamarGaleria(View v){
        Intent i = new Intent(this, Galeria.class);
        startActivity(i);
    }

   public void llamarBolita(View v){
        Intent i = new Intent(this, Bolita.class);
        startActivity(i);
    }*/
}

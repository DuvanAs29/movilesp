package com.example.tromsoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;
    I

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);

        moldeRestaurante=(MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");
        Toast.makeText(this,moldeRestaurante.getNombreRes(), Toast.LENGTH_LONG).show();
    }
}
package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeRestaurante;

public class AmpliandoRestaurante extends AppCompatActivity {

    MoldeRestaurante moldeRestaurante;

    ImageView fotoAmpliandoRest;

    TextView tituloRest;

    TextView precioRest;

    TextView contactoRest;

    TextView telefonoRest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurante);
        fotoAmpliandoRest = findViewById(R.id.r11am);
        tituloRest=findViewById(R.id.titulor11am);
        precioRest=findViewById(R.id.precior11am);
        contactoRest=findViewById(R.id.contacto11am);
        telefonoRest=findViewById(R.id.telefono11am);

        moldeRestaurante=(MoldeRestaurante) getIntent().getSerializableExtra("datosrestaurante");

        fotoAmpliandoRest.setImageResource(moldeRestaurante.getFotoRes());
        tituloRest.setText(moldeRestaurante.getNombreRes());
        precioRest.setText(moldeRestaurante.getRango());
        contactoRest.setText(moldeRestaurante.getContactoRes());
        telefonoRest.setText(moldeRestaurante.getTelefonoRes());


    }
}
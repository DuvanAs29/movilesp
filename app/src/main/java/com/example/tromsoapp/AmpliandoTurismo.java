package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeTurismo;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;

    TextView nombreSit;

    ImageView fotoSit;

    TextView contactoSit;

    TextView telefonoSit;

    TextView precioSit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosturismo");
        nombreSit=findViewById(R.id.titulotu11);
        fotoSit=findViewById(R.id.tu11);
        contactoSit=findViewById(R.id.contactotu11);
        telefonoSit=findViewById(R.id.contacto11tu);
        precioSit=findViewById(R.id.cpptu11res);



        nombreSit.setText(moldeTurismo.getNombre());
        fotoSit.setImageResource(moldeTurismo.getFoto());
        contactoSit.setText(moldeTurismo.getContacto());
        telefonoSit.setText(moldeTurismo.getTelefono());
        precioSit.setText(moldeTurismo.getPrecio());
    }
}
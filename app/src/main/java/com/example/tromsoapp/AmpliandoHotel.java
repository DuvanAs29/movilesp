package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;

    TextView tituloHotel;

    TextView descripcionAmpliendoHotel;

    TextView contactoHotel;

    TextView telefonoHotel;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);

        fotoAmpliandoHotel=findViewById(R.id.hotel11);
        tituloHotel=findViewById(R.id.titulohotel11);
        descripcionAmpliendoHotel=findViewById(R.id.descrp11);
        contactoHotel=findViewById(R.id.contacto11);
        telefonoHotel=findViewById(R.id.telefono11);


        moldeHotel = (MoldeHotel) getIntent().getSerializableExtra("datoshotel");
        //cargando la info en los componentes  graficos
        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        tituloHotel.setText(moldeHotel.getNombre1());
        descripcionAmpliendoHotel.setText(moldeHotel.getDescripcion());
        contactoHotel.setText(moldeHotel.getContacto());
        telefonoHotel.setText(moldeHotel.getTelefono());
    }
}
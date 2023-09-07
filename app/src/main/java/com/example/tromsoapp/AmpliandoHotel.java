package com.example.tromsoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    TextView descripcionAmpliendoHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);

        fotoAmpliandoHotel=findViewById(R.id.hotel11);
        descripcionAmpliendoHotel=findViewById(R.id.precio11);

        moldeHotel = (MoldeHotel) getIntent().getSerializableExtra("datoshotel");
        //cargando la info en los componentes  graficos
        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        descripcionAmpliendoHotel.setText((moldeHotel.getNombre1()));
    }
}
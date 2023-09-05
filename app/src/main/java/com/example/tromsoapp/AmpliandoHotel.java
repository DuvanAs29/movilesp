package com.example.tromsoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);

        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this,moldeHotel.getNombre1(), Toast.LENGTH_LONG).show();
    }
}
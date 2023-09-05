package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.tromsoapp.moldes.MoldeTurismo;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeTurismo moldeTurismo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        moldeTurismo=(MoldeTurismo) getIntent().getSerializableExtra("datosturismo");
        Toast.makeText(this, moldeTurismo.getNombre(), Toast.LENGTH_LONG).show();
    }
}
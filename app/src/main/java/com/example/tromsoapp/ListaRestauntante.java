package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tromsoapp.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class ListaRestauntante extends AppCompatActivity {

    ArrayList<MoldeRestaurante> lista_Restaurante=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_restauntante);
    }
}
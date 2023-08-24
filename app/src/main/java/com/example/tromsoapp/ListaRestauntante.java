package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.tromsoapp.adaptadores.AdaptadorRestaurante;
import com.example.tromsoapp.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class ListaRestauntante extends AppCompatActivity {

    ArrayList<MoldeRestaurante> lista_Restaurante=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_restauntante);
        recyclerView=findViewById(R.id.dinamicarestaurante);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        llenarLIstaConDatosr();
        AdaptadorRestaurante adaptadorRestaurante=new AdaptadorRestaurante(lista_Restaurante);
        recyclerView.setAdapter(adaptadorRestaurante);
    }
    public void llenarLIstaConDatosr(){

        lista_Restaurante.add(new MoldeRestaurante("Restaurante1", R.drawable.res1,"Rango De precio ($15000-50000)","Telefono:3220585650","Plato Recomendado:Chorizo"));
        lista_Restaurante.add(new MoldeRestaurante("Restaurante1", R.drawable.res2,"Rango De precio ($15000-50000)","Telefono:3220585650","Plato Recomendado:Chorizo"));
        lista_Restaurante.add(new MoldeRestaurante("Restaurante1", R.drawable.res3,"Rango De precio ($15000-50000)","Telefono:3220585650","Plato Recomendado:Chorizo"));



    }
}
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

        lista_Restaurante.add(new MoldeRestaurante(R.drawable.res1, "Rest1", "1000", "2343534", "aaaa","ssdsd"));
        lista_Restaurante.add(new MoldeRestaurante(R.drawable.res2, "Rest2", "2000", "234353222", "aaaa2","ssdsd2"));
        lista_Restaurante.add(new MoldeRestaurante(R.drawable.res3, "Rest3", "3000", "2343534333", "aaaa3","ssdsd3"));

    }
}
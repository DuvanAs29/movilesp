package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



import com.example.tromsoapp.adaptadores.AdaptadoresTurismo;
import com.example.tromsoapp.moldes.MoldeRestaurante;
import com.example.tromsoapp.moldes.MoldeTurismo;

import java.util.ArrayList;

public class ListaTurismo extends AppCompatActivity {

    ArrayList<MoldeTurismo>lista_Turismo=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_turismo);
        recyclerView=findViewById(R.id.dinamicaturismo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        llenarLIstaConDatost();
        AdaptadoresTurismo adaptadoresTurismo=new AdaptadoresTurismo(lista_Turismo);
        recyclerView.setAdapter(adaptadoresTurismo);
    }
    public void llenarLIstaConDatost(){
        lista_Turismo.add(new MoldeTurismo("Plaza Simon Bolivar","gratis" ,"Contacto: Nombre De Persona","Telefono:3220585650",R.drawable.cuadrado));
        lista_Turismo.add(new MoldeTurismo("Plaza Simon Bolivar","gratis" ,"Contacto: Nombre De Persona","Telefono:3220585650",R.drawable.catedral));
        lista_Turismo.add(new MoldeTurismo("Plaza Simon Bolivar","gratis" ,"Contacto: Nombre De Persona","Telefono:3220585650",R.drawable.parque));

    }
}
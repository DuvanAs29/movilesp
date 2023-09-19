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
        lista_Turismo.add(new MoldeTurismo("Plaza Simon Bolivar1",R.drawable.cuadrado ,"Contacto: Nombre De Persona1","1212212", "1111111"));
        lista_Turismo.add(new MoldeTurismo("Plaza Simon Bolivar2",R.drawable.catedral ,"Contacto: Nombre De Persona2","23232323", "22222222"));
        lista_Turismo.add(new MoldeTurismo("Plaza Simon Bolivar3",R.drawable.parque ,"Contacto: Nombre De Persona3","3434343434", "3333333"));

    }
}
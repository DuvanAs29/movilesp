package com.example.tromsoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tromsoapp.adaptadores.AdaptadorHotel;
import com.example.tromsoapp.moldes.MoldeHotel;

import java.util.ArrayList;

public class HomeHotel extends AppCompatActivity {

    ArrayList<MoldeHotel> lista_hotel=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_hotel);
        recyclerView=findViewById(R.id.dinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
        llenarLIstaConDatos();
        AdaptadorHotel adaptadorHotel=new AdaptadorHotel(lista_hotel);
        recyclerView.setAdapter(adaptadorHotel);


    }
    public void llenarLIstaConDatos(){
        lista_hotel.add(new MoldeHotel(R.drawable.hotel1, "Hotel la Patasola", "Tu no metes cabra","100","aaaaa","12354634"));
        lista_hotel.add(new MoldeHotel(R.drawable.hotel2, "Hotel la Patasola2", "Tu no metes cabra2","1002","aaaaa2","123546342"));


    }

}
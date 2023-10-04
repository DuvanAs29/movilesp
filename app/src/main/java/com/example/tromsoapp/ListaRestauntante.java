package com.example.tromsoapp;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import com.example.tromsoapp.adaptadores.AdaptadorRestaurante;
import com.example.tromsoapp.moldes.MoldeRestaurante;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaRestauntante extends AppCompatActivity {

    ArrayList<MoldeRestaurante> lista_Restaurante=new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_restauntante);
        recyclerView=findViewById(R.id.dinamicarestaurante);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        db.collection("restaurantes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());

                                String nombreRestaurante= document.getString("nombre");
                                String precioRestaurante= document.getString("precio");


                                Toast.makeText(ListaRestauntante.this, nombreRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestauntante.this, precioRestaurante, Toast.LENGTH_SHORT).show();
                            }
                        } else {

                        }
                    }
                });
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
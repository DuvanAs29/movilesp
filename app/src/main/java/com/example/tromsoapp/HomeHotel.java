package com.example.tromsoapp;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.tromsoapp.adaptadores.AdaptadorHotel;
import com.example.tromsoapp.moldes.MoldeHotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class HomeHotel extends AppCompatActivity {

    ArrayList<MoldeHotel> lista_hotel=new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_hotel);
        recyclerView=findViewById(R.id.dinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());

                                String nombreHotel= document.getString("nombre");
                                String precioHotel= document.getString("precio");
                                String contactoHotel=document.getString("contacto");
                                String descripcionHotel=document.getString("descripcion");



                                Toast.makeText(HomeHotel.this, nombreHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(HomeHotel.this, precioHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(HomeHotel.this, contactoHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(HomeHotel.this, descripcionHotel, Toast.LENGTH_SHORT).show();
                            }
                        } else {

                        }
                    }
                });


        llenarLIstaConDatos();
        AdaptadorHotel adaptadorHotel=new AdaptadorHotel(lista_hotel);
        recyclerView.setAdapter(adaptadorHotel);


    }
    public void llenarLIstaConDatos(){
        lista_hotel.add(new MoldeHotel(R.drawable.hotel1, "Hotel la Patasola", "Tu no metes cabra","100","aaaaa","12354634"));
        lista_hotel.add(new MoldeHotel(R.drawable.hotel2, "Hotel la Patasola2", "Tu no metes cabra2","1002","aaaaa2","123546342"));
        lista_hotel.add(new MoldeHotel(R.drawable.hotel3, "Hotel la Patasola2", "Tu no metes cabra2","1002","aaaaa2","123546342"));



    }

}
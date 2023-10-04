package com.example.tromsoapp;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import com.example.tromsoapp.adaptadores.AdaptadoresTurismo;
import com.example.tromsoapp.moldes.MoldeRestaurante;
import com.example.tromsoapp.moldes.MoldeTurismo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaTurismo extends AppCompatActivity {

    ArrayList<MoldeTurismo>lista_Turismo=new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_turismo);
        recyclerView=findViewById(R.id.dinamicaturismo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        db.collection("sitios")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());

                                String nombreSitio= document.getString("nombre");
                                String precioSitio= document.getString("precio");


                                Toast.makeText(ListaTurismo.this, nombreSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaTurismo.this, precioSitio, Toast.LENGTH_SHORT).show();
                            }
                        } else {

                        }
                    }
                });
        llenarLIstaConDatost();
        AdaptadoresTurismo adaptadoresTurismo=new AdaptadoresTurismo(lista_Turismo);
        recyclerView.setAdapter(adaptadoresTurismo);
    }
    public void llenarLIstaConDatost(){
        lista_Turismo.add(new MoldeTurismo("Plaza Simon Bolivar",R.drawable.plazabolivar ,"Contacto: Nombre De Persona1","1212212", "1111111"));
        lista_Turismo.add(new MoldeTurismo("Catedral Nuestra Señora del Rosario de Chiquinquirá",R.drawable.catedrals ,"Contacto: Nombre De Persona2","23232323", "22222222"));
        lista_Turismo.add(new MoldeTurismo("Cascadas de Oro Bajo",R.drawable.cascadas ,"Contacto: Nombre De Persona3","3434343434", "3333333"));

    }
}
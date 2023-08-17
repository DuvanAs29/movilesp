package com.example.tromsoapp.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tromsoapp.R;

import com.example.tromsoapp.moldes.MoldeRestaurante;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdaptadorRestaurante extends RecyclerView.Adapter<AdaptadorRestaurante.viewHolder> {

    public ArrayList<MoldeRestaurante> lista_Restaurante;

    public AdaptadorRestaurante() {
    }

    @NonNull
    @Override
    public AdaptadorRestaurante.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false );
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurante.viewHolder holder, int position) {

        holder.actualizarDatos(lista_Restaurante.get(position));

    }

    @Override
    public int getItemCount() {
        return lista_Restaurante.size();
    }

    public AdaptadorRestaurante(ArrayList<MoldeRestaurante> listaRestaurante) {
        this.lista_Restaurante = listaRestaurante;
    }

    public  class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreRestaurante;
        ImageView fotoRes;
        TextView rangoRes;
        TextView contactoRes;
        TextView platoRes;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreRestaurante=itemView.findViewById(R.id.tituloresl11);
            fotoRes=itemView.findViewById(R.id.res11);
            rangoRes=itemView.findViewById(R.id.rango11);
            contactoRes=itemView.findViewById(R.id.contacto11res);
            platoRes=itemView.findViewById(R.id.pr11res);
        }

        public  void actualizarDatos(MoldeRestaurante moldeRestaurante) {

            nombreRestaurante.setText(moldeRestaurante.getNombreRes());
            fotoRes.setImageResource(moldeRestaurante.getFotoRes());
            rangoRes.setText(moldeRestaurante.getRango());
            contactoRes.setText(moldeRestaurante.getTelefonoRes());
            platoRes.setText(moldeRestaurante.getRecomendado());

        }
    }
}


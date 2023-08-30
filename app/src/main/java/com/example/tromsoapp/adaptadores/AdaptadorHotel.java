package com.example.tromsoapp.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tromsoapp.AmpliandoHotel;
import com.example.tromsoapp.R;
import com.example.tromsoapp.moldes.MoldeHotel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdaptadorHotel extends RecyclerView.Adapter<AdaptadorHotel.viewHolder> {

    public ArrayList<MoldeHotel> lista_hotel;

    public AdaptadorHotel() {
    }

    @NonNull
    @Override
    public AdaptadorHotel.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false );
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHotel.viewHolder holder, int position) {

        holder.actualizarDatos(lista_hotel.get(position));

    }

    @Override
    public int getItemCount() {
        return lista_hotel.size();
    }

    public AdaptadorHotel(ArrayList<MoldeHotel> home_hotel) {
        this.lista_hotel = home_hotel;
    }

    public  class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.hotel11);
            nombreHotel=itemView.findViewById(R.id.titulohotel11);
            precioHotel=itemView.findViewById(R.id.precio11);
            contactoHotel=itemView.findViewById(R.id.contacto11);
        }

        public  void actualizarDatos(MoldeHotel moldeHotel) {

            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre1());
            precioHotel.setText(moldeHotel.getPrecio());
            contactoHotel.setText(moldeHotel.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), AmpliandoHotel.class);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}

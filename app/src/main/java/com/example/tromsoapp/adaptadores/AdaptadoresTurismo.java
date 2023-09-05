package com.example.tromsoapp.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tromsoapp.AmpliandoTurismo;
import com.example.tromsoapp.R;

import com.example.tromsoapp.moldes.MoldeRestaurante;
import com.example.tromsoapp.moldes.MoldeTurismo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdaptadoresTurismo extends RecyclerView.Adapter<AdaptadoresTurismo.viewHolder> {

    public ArrayList<MoldeTurismo> lista_Turismo;

    public AdaptadoresTurismo() {
    }

    @NonNull
    @Override
    public AdaptadoresTurismo.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldeturismo,null,false );
        return new viewHolder(vista);

    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadoresTurismo.viewHolder holder, int position) {

        holder.actualizarDatos(lista_Turismo.get(position));

    }

    @Override
    public int getItemCount() {
        return lista_Turismo.size();
    }

    public AdaptadoresTurismo(ArrayList<MoldeTurismo> listaTurismo) {
        this.lista_Turismo = listaTurismo;
    }

    public  class viewHolder extends RecyclerView.ViewHolder {
        TextView tiTurismo;
        ImageView fotoTU;
        TextView conNombre;
        TextView contactoTu;
        TextView precioTu;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            tiTurismo=itemView.findViewById(R.id.titulotu11);
            fotoTU=itemView.findViewById(R.id.tu11);
            conNombre=itemView.findViewById(R.id.contactotu11);
            contactoTu=itemView.findViewById(R.id.contacto11tu);
            precioTu=itemView.findViewById(R.id.cpptu11res);
        }

        public  void actualizarDatos(MoldeTurismo moldeTurismo) {

            tiTurismo.setText(moldeTurismo.getNombre());
            fotoTU.setImageResource(moldeTurismo.getFoto());
            conNombre.setText(moldeTurismo.getNombre());
            contactoTu.setText(moldeTurismo.getTelefono());
            precioTu.setText(moldeTurismo.getPrecio());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent =new Intent(itemView.getContext(), AmpliandoTurismo.class);
                    intent.putExtra("datosturismo",moldeTurismo);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}



package com.ccc.cmaradecomerciodecasanare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterSalones extends RecyclerView.Adapter<AdapterSalones.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;

    ArrayList<Salon> model;

    private View.OnClickListener listener;

    public AdapterSalones(Context context, ArrayList<Salon> model){

        this.inflater = LayoutInflater.from(context);
        this.model = model;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.custom_view, parent, false);

        view.setOnClickListener(this);

        return new ViewHolder(view);

    }

    public void setOnClickListener(View.OnClickListener listener){

        this.listener = listener;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String titulo = model.get(position).getTitulo();
        int imagen = model.get(position).getImageId();
        String especificaciones = model.get(position).getEspecificaciones();

        holder.titulo.setText(titulo);
        holder.imagen.setImageResource(imagen);
        holder.especificaciones.setText(especificaciones);


    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View v) {

        if(listener!=null){

            listener.onClick(v);

        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        ImageView imagen;
        TextView especificaciones;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.titulosalon);
            imagen = itemView.findViewById(R.id.imagesalon);
            especificaciones = itemView.findViewById(R.id.especificaciones);


        }
    }

}

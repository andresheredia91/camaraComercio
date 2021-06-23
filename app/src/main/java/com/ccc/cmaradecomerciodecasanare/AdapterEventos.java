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

public class AdapterEventos extends RecyclerView.Adapter<AdapterEventos.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;

    ArrayList<Evento> model;

    private View.OnClickListener listener;

    public AdapterEventos(Context context, ArrayList<Evento> model){

        this.inflater = LayoutInflater.from(context);
        this.model = model;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.custom_view2, parent, false);

        view.setOnClickListener(this);

        return new ViewHolder(view);

    }

    public void setOnClickListener(View.OnClickListener listener){

        this.listener = listener;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        int imagen = model.get(position).getImageId();

        holder.imagen.setImageResource(imagen);

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

        ImageView imagen;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.imageEvento);

        }
    }

}

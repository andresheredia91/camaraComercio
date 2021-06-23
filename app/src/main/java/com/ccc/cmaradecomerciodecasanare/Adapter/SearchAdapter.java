package com.ccc.cmaradecomerciodecasanare.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ccc.cmaradecomerciodecasanare.R;
import com.ccc.cmaradecomerciodecasanare.model.Consulta;

import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{

    public TextView matricula, razon_social, organizacion_juridica, estado, nombre_camara;


    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);

        matricula = (TextView) itemView.findViewById(R.id.matricula);
        razon_social = (TextView) itemView.findViewById(R.id.razon_social);
        organizacion_juridica = (TextView) itemView.findViewById(R.id.organizacion_juridica);
        estado = (TextView) itemView.findViewById(R.id.estado);
        nombre_camara = (TextView) itemView.findViewById(R.id.nombre_camara);

    }
}

public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder> {

    private Context context;
    private List<Consulta> consultas;

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View itemView = inflater.inflate(R.layout.item,parent,false);

        return new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {

        holder.matricula.setText(consultas.get(position).getMatricula());
        holder.razon_social.setText(consultas.get(position).getRazon_social());
        holder.organizacion_juridica.setText(consultas.get(position).getOrganizacion_juridica());
        holder.estado.setText(consultas.get(position).getEstado());
        holder.nombre_camara.setText(consultas.get(position).getNombre_camara());

    }

    @Override
    public int getItemCount() {

        return consultas.size();

    }
}

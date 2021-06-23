package com.ccc.cmaradecomerciodecasanare.ui.eventos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ccc.cmaradecomerciodecasanare.AdapterEventos;
import com.ccc.cmaradecomerciodecasanare.Evento;
import com.ccc.cmaradecomerciodecasanare.R;
import com.ccc.cmaradecomerciodecasanare.Salon;

import java.util.ArrayList;

public class EventosFragment extends Fragment {

    RecyclerView recyclerView;
    AdapterEventos adapterEventos;
    ArrayList<Evento> listEventos;

    private EventosViewModel eventosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        eventosViewModel =
                ViewModelProviders.of(this).get(EventosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_eventos, container, false);


        recyclerView = root.findViewById(R.id.recycleView2);

        listEventos = new ArrayList<Evento>();

        cargarList();
        mostrarData();

        return root;
    }

    private void cargarList() {

        listEventos.add(new Evento(R.drawable.primero));
        listEventos.add(new Evento(R.drawable.segundo));
        listEventos.add(new Evento(R.drawable.tercero));
        listEventos.add(new Evento(R.drawable.cuarto));

    }

    public void mostrarData() {

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterEventos = new AdapterEventos(getContext(), listEventos);
        recyclerView.setAdapter(adapterEventos);


    }
}
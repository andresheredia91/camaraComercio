package com.ccc.cmaradecomerciodecasanare.ui.salones;

import android.app.Activity;
import android.content.Context;
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

import com.ccc.cmaradecomerciodecasanare.AdapterSalones;
import com.ccc.cmaradecomerciodecasanare.R;
import com.ccc.cmaradecomerciodecasanare.Salon;

import java.util.ArrayList;

public class SalonesFragment extends Fragment {

    RecyclerView recyclerView;
    AdapterSalones adapterSalon;
    ArrayList<Salon> list;


    private SalonesViewModel salonesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        salonesViewModel =
                ViewModelProviders.of(this).get(SalonesViewModel.class);

        View recycler = inflater.inflate(R.layout.fragment_salones, container, false);

        recyclerView = recycler.findViewById(R.id.recycleView);

        list = new ArrayList<>();

        cargarList();
        mostrarData();

        return recycler;
    }

    private void cargarList() {

        list.add(new Salon("Salón Quiripa", R.drawable.quiripa1, "Aforo: 650 personas \n" + "Mts2: 512,53"));
        list.add(new Salon("Salón Bandola", R.drawable.bandola1, "Aforo tipo auditorio: 45 personas \n" + "Aforo tipo escuela: 60 personas\n" + "Mts2: 67,05\n"));
        list.add(new Salon("Salón Joropo", R.drawable.joropo, "Aforo tipo auditorio: 120 personas \n" + "Aforo tipo escuela: 90 personas\n" + "Mts2: 148,75"));
        list.add(new Salon("Salón Cayena", R.drawable.cayena, "Aforo tipo auditorio: 70 personas \n" + "Aforo tipo escuela: 51 personas\n" + "Mts2: 74,47"));
        list.add(new Salon("Salón Jaguar", R.drawable.jaguar, ""));
        list.add(new Salon("Sala Tito Cuenca", R.drawable.tito, "Aforo: 18 personas \n" + "Mts2: 36,25"));
        list.add(new Salon("Sala Carlos Hernando Vargas", R.drawable.carlos, "Aforo tipo sala de juntas: 10 personas \n" + "Mts2: 24,76"));
        list.add(new Salon("Sala Julio Salcedo", R.drawable.julio, "Aforo tipo sala de juntas: 20 personas \n" + "Mts2: 40,5"));
        list.add(new Salon("Sala Luz del Carmen Mojica", R.drawable.mojica, "Aforo tipo sala de juntas: 10 personas \n" + "Mts2: 24,76"));
        list.add(new Salon("Sala Álvaro Sanabria", R.drawable.alvaro, "Aforo tipo sala de juntas: 10 personas \n" + "Mts2: 37,96"));
        list.add(new Salon("Expansión", R.drawable.expansion, ""));
        list.add(new Salon("Terraza", R.drawable.terraza, "Aforo tipo sala de juntas: 10 personas \n" + "Mts2: 37,96"));

    }

    public void mostrarData() {

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterSalon = new AdapterSalones(getContext(), list);
        recyclerView.setAdapter(adapterSalon);


    }
}
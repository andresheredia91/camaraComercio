package com.ccc.cmaradecomerciodecasanare.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.ccc.cmaradecomerciodecasanare.R;
import com.ccc.cmaradecomerciodecasanare.databinding.FragmentHomeBinding;
import com.ccc.cmaradecomerciodecasanare.ui.certificados.CertificadosFragment;
import com.ccc.cmaradecomerciodecasanare.ui.eventos.EventosFragment;
import com.ccc.cmaradecomerciodecasanare.ui.renovacion.RenovacionFragment;
import com.ccc.cmaradecomerciodecasanare.ui.sedes.SedesFragment;
import com.ccc.cmaradecomerciodecasanare.ui.tramites.TramitesFragment;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        /*homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;*/

        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    public void onViewCreated(View view, Bundle savedInstanceState){

        super.onViewCreated(view, savedInstanceState);

        binding.buttoncertificados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment certificadosFragment = new CertificadosFragment();
                FragmentManager fragmentManager = getParentFragment().getChildFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, certificadosFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        binding.buttonrenovacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment renovacionFragment = new RenovacionFragment();
                FragmentManager fragmentManager = getParentFragment().getChildFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, renovacionFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });


        binding.buttonTramites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment tramitesFragment = new TramitesFragment();
                FragmentManager fragmentManager = getParentFragment().getChildFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, tramitesFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        binding.buttonEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment eventosFragment = new EventosFragment();
                FragmentManager fragmentManager = getParentFragment().getChildFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, eventosFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        binding.buttonSedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment sedesFragment = new SedesFragment();
                FragmentManager fragmentManager = getParentFragment().getChildFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment, sedesFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

    public void onDestroy(){

        super.onDestroy();
        binding = null;

    }
}
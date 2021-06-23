package com.ccc.cmaradecomerciodecasanare.ui.renovacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.ccc.cmaradecomerciodecasanare.Consultar;
import com.ccc.cmaradecomerciodecasanare.R;
import com.ccc.cmaradecomerciodecasanare.Registrar;

public class RenovacionFragment extends Fragment {

    Button btnIngresar, btnRegistrar;

    private RenovacionViewModel renovacionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        renovacionViewModel =
                ViewModelProviders.of(this).get(RenovacionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_renovacion, container, false);

        btnIngresar = (Button) root.findViewById(R.id.buttonConsultar);
        btnRegistrar = (Button) root.findViewById(R.id.buttonRegistrar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Consultar.class);
                intent.putExtra("some", "some data");
                startActivity(intent);
            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Registrar.class);
                intent.putExtra("some", "some data");
                startActivity(intent);
            }
        });

        return root;

    }
}
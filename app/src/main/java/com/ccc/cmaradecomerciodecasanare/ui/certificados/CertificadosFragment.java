package com.ccc.cmaradecomerciodecasanare.ui.certificados;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.ccc.cmaradecomerciodecasanare.R;
import com.ccc.cmaradecomerciodecasanare.TiposCertificados;

public class CertificadosFragment extends Fragment {


    private CertificadosViewModel certificadosViewModel;

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        certificadosViewModel =
                ViewModelProviders.of(this).get(CertificadosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_certificados, container, false);



        Button bntTipo = (Button) root.findViewById(R.id.buttonTipo);
        bntTipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TiposCertificados.class);
                intent.putExtra("some", "some data");
                startActivity(intent);
            }
        });



        return root;


    }

}
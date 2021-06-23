package com.ccc.cmaradecomerciodecasanare.ui.tramites;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.ccc.cmaradecomerciodecasanare.R;

public class TramitesFragment extends Fragment {

    private TramitesViewModel tramitesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        tramitesViewModel =
                ViewModelProviders.of(this).get(TramitesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tramites, container, false);

        return root;
    }
}
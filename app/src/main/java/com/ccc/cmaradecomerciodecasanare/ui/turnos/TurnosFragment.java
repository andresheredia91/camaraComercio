package com.ccc.cmaradecomerciodecasanare.ui.turnos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ccc.cmaradecomerciodecasanare.R;

public class TurnosFragment extends Fragment {

    private TurnosViewModel turnosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        turnosViewModel =
                ViewModelProviders.of(this).get(TurnosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_turnos, container, false);
        return root;
    }
}
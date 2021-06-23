package com.ccc.cmaradecomerciodecasanare.ui.contactenos;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ccc.cmaradecomerciodecasanare.R;

public class ContactenosFragment extends Fragment {

    private ContactenosViewModel contactenosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        contactenosViewModel =
                ViewModelProviders.of(this).get(ContactenosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_contactenos, container, false);


        return root;
    }
}
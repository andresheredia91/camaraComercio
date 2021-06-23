package com.ccc.cmaradecomerciodecasanare.ui.sedes;

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
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SedesFragment extends Fragment implements OnMapReadyCallback{

    GoogleMap map;

    private SedesViewModel sedesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        sedesViewModel =
                ViewModelProviders.of(this).get(SedesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sedes, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map);
        mapFragment.getMapAsync(this);

        return root;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;
        map.setMapType(googleMap.MAP_TYPE_NORMAL);
        map.getUiSettings().setZoomControlsEnabled(true);

        LatLng yopal = new LatLng(5.346540, -72.389707);
        LatLng aguazul = new LatLng(5.168224, -72.550948);
        LatLng trinidad = new LatLng(5.406975, -71.662858);
        LatLng monterrey = new LatLng(4.875936, -72.893613);
        LatLng ariporo = new LatLng(5.879445, -71.891584);
        LatLng villanueva = new LatLng(4.610521, -72.931602);
        LatLng tauramena = new LatLng(5.017299, -72.750603);
        LatLng mani = new LatLng(4.816232, -72.283616);

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(yopal, 20));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(aguazul, 20));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(trinidad, 20));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(monterrey, 20));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(ariporo, 20));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(villanueva, 20));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(tauramena, 20));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(mani, 20));

        MarkerOptions cccyopal = new MarkerOptions().title("Yopal").snippet("Carrera 29 N 14 - 47").position(yopal);
        MarkerOptions cccaguazul = new MarkerOptions().title("Aguazul").snippet("Carrera 15 N 7A - 15").position(aguazul);
        MarkerOptions ccctrinidad = new MarkerOptions().title("Trinidad").snippet("Calle 6 N 3 - 55").position(trinidad);
        MarkerOptions cccmonterrey = new MarkerOptions().title("Monterrey").snippet("Calle 16 N 7 - 29").position(monterrey);
        MarkerOptions cccariporo = new MarkerOptions().title("Paz de Ariporo").snippet("Calle 9 N 6 - 57").position(ariporo);
        MarkerOptions cccvillanueva = new MarkerOptions().title("Villanueva").snippet("Carrera 13 N 8 - 24").position(villanueva);
        MarkerOptions ccctauramena = new MarkerOptions().title("Tauramena").snippet("Carrera 4 N 17 - 55").position(tauramena);
        MarkerOptions cccmani = new MarkerOptions().title("Maní").position(mani);

        map.addMarker(cccyopal);
        map.addMarker(cccaguazul);
        map.addMarker(ccctrinidad);
        map.addMarker(cccmonterrey);
        map.addMarker(cccariporo);
        map.addMarker(cccvillanueva);
        map.addMarker(ccctauramena);
        map.addMarker(cccmani);

    }
}


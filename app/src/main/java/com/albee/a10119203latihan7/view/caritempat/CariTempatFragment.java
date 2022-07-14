package com.albee.a10119203latihan7.view.caritempat;
/*
    10119203, Albee Akbar Fillah, IF5 
    14 Juli 2022
*/

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.albee.a10119203latihan7.R;


public class CariTempatFragment extends Fragment implements OnMapReadyCallback{
    private GoogleMap mMap;

    public CariTempatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cari_spbu, container, false);
        SupportMapFragment mMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.carikulinermap);
        mMapFragment.getMapAsync(this);
        return view;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Bandung and move the camera
        LatLng spbu_bandung_dago = new LatLng(-6.88999, 107.61299);
        LatLng spbui_34 = new LatLng(-6.88872, 107.61659);
        LatLng sadangserang = new LatLng(-6.890933740278712, 107.62556008781769);
        LatLng bensineceran = new LatLng(-6.885079608453048, 107.62218292604334);
        LatLng pommini = new LatLng(-6.8850690540679, 107.62309522419416);

        mMap.addMarker(new MarkerOptions().position(spbu_bandung_dago).title("SPBU-Bandung Dago"));
        mMap.addMarker(new MarkerOptions().position(spbui_34).title("SPBU 34.401.25"));
        mMap.addMarker(new MarkerOptions().position(sadangserang).title("SPBU 3440231"));
        mMap.addMarker(new MarkerOptions().position(bensineceran).title("Bensin Eceran Sadang Serang"));
        mMap.addMarker(new MarkerOptions().position(pommini).title("Pom Mini Baksem Bandung"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sadangserang, 14));

    }
}
package com.albee.a10119203latihan7.view.informasi;
/*
    10119203, Albee Akbar Fillah, IF5
    14 Juli 2022
*/
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.albee.a10119203latihan7.R;
import com.albee.a10119203latihan7.models.InformasiItemModel;

import java.util.ArrayList;
import java.util.List;

public class InformasiFragment extends Fragment {
    ViewPager2 viewPager2;
    List<InformasiItemModel> informasiList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_informasi, container, false);

        viewPager2 = view.findViewById(R.id.viewpager);
        informasiList = new ArrayList<>();

        String[] judul = {"About"};
        String[] desc = {"Aplikasi ini dibuat oleh Albee Akbar FIllah (10119203), kelas IF5 untuk memenuhi saalah satu tugas AKB"};

        for (int i = 0; i < judul.length; i++) {
            InformasiItemModel item = new InformasiItemModel(judul[i], desc[i]);
            informasiList.add(item);
        }

        ViewPagerInformasiAdapter adapter = new ViewPagerInformasiAdapter(informasiList);

        viewPager2.setAdapter(adapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);


        return view;
    }
}
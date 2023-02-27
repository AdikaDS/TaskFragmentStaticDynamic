package com.example.taskfragmentstaticdynamic;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentDeskripsi extends Fragment {

    public FragmentDeskripsi() {
        // Required empty public constructor
    }

  public static FragmentDeskripsi newInstance(String param1, String param2) {
        return new FragmentDeskripsi();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deskripsi, container, false);
    }
}
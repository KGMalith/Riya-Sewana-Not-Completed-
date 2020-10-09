package com.example.riyasewana.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.riyasewana.LoginRegister.Welcome;
import com.example.riyasewana.R;
import com.google.firebase.auth.FirebaseAuth;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home extends Fragment {

    Button vehicles,parts;

    public Home() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
       View v =   inflater.inflate(R.layout.fragment_home, container, false);
         vehicles = v.findViewById(R.id.button2);
         parts = v.findViewById(R.id.button);


        vehicles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SearchVehicle vehicles = new SearchVehicle();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container_fragment, vehicles);
                transaction.commit();
            }

        });

        parts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SearchParts parts = new SearchParts();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container_fragment, parts);
                transaction.commit();
            }

        });


         return v;
    }
}
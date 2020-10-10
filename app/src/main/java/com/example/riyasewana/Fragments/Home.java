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
import com.example.riyasewana.SearchParts.SearchParts;
import com.example.riyasewana.SearchVehicle.SearchVehicles;
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
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),SearchVehicles.class));
            }
        });

        parts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),SearchParts.class));
            }
        });


         return v;
    }
}
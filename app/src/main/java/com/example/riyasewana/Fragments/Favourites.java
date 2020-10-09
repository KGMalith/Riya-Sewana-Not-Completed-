package com.example.riyasewana.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.riyasewana.Adapters.FavouritesAdapter;
import com.example.riyasewana.Adapters.MyAdsAdapter;
import com.example.riyasewana.Adapters.VehicleSearchAdapter;
import com.example.riyasewana.Models.VehicleModel;
import com.example.riyasewana.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Favourites extends Fragment {

    public Favourites() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    List<VehicleModel> vehicleList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favourites, container, false);


        recyclerView = view.findViewById(R.id.recycler_favourites);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(new FavouritesAdapter(vehicleData()) {
        });


        return view;
    }

    private List<VehicleModel> vehicleData() {

        vehicleList = new ArrayList<VehicleModel>();
        vehicleList.add(new VehicleModel(R.drawable.toyota_premio, "Toyota Premio 2013", "Rs7,650,000", "30,000 km", "Auto", "Kurunagela"));
        vehicleList.add(new VehicleModel(R.drawable.toyota_vitz_2007, "Toyota Vitz 2004", "Rs180,000", "2,500 km", "Auto", "Gampaha"));
        vehicleList.add(new VehicleModel(R.drawable.toyota_land_cruiser_prado, "Toyota Land Cruiser 2005", "Rs130,000", "9,500,000 km", "Auto", "Malabe"));

        return vehicleList;
    }


}
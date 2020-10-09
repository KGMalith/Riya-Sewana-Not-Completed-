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

import com.example.riyasewana.Adapters.MyAdsAdapter;
import com.example.riyasewana.Adapters.VehicleSearchAdapter;
import com.example.riyasewana.Models.VehicleModel;
import com.example.riyasewana.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyAds extends Fragment {

    public MyAds() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    List<VehicleModel> vehicleList;
    ImageView myAdsBack;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_ads, container, false);

        myAdsBack = view.findViewById(R.id.my_ads_back);
        recyclerView = view.findViewById(R.id.recycler_myads);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerView.setAdapter(new MyAdsAdapter(vehicleData()) {
        });

        myAdsBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Profile profile = new Profile();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container_fragment,profile);
                transaction.commit();
            }
        });

        return view;
    }

    private List<VehicleModel> vehicleData() {

        vehicleList = new ArrayList<VehicleModel>();
        vehicleList.add(new VehicleModel(R.drawable.toyota_prius,"Toyota Prius", "Rs.3,480,000", "127,000 km", "Auto", "Dehiwala"));
        vehicleList.add(new VehicleModel(R.drawable.hyundai_xg30, "Hyundai XG30", "Rs.1,280,000", "15,000 km", "Auto", "Athurugiriya"));

        return vehicleList;
    }


}
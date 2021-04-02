package com.rex.foodmobileapps.FragmentUI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rex.foodmobileapps.Adapter.RecyclerView_FavouriteAdapter;
import com.rex.foodmobileapps.Model.FavouriteModel;
import com.rex.foodmobileapps.Model.FoodItemModel;
import com.rex.foodmobileapps.R;

import java.util.ArrayList;


public class Favourite extends Fragment {

   private RecyclerView recyclerView;
   private ArrayList<FavouriteModel> favouriteModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favourite, container, false);

        recyclerView = view.findViewById(R.id.favouriteRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        favouriteModels.add(new FavouriteModel("Beef Burger","Onion with cheese",
        "18.00",R.drawable.burger));

        favouriteModels.add(new FavouriteModel("Classic Burger",
                "Grilled Chicken","24.00",R.drawable.burger4));

        favouriteModels.add(new FavouriteModel("Beef Burger","Onion with cheese"
                ,"18.00",R.drawable.pasta2));

        favouriteModels.add(new FavouriteModel("Beef Burger","Onion with cheese",
       "12.00",R.drawable.salads4));

        recyclerView.setAdapter(new RecyclerView_FavouriteAdapter(favouriteModels,getContext()));




        return view;
    }
}
package com.rex.foodmobileapps.FragmentUI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rex.foodmobileapps.Adapter.RecyclerView_FoodAdapter;
import com.rex.foodmobileapps.Model.FoodItemModel;
import com.rex.foodmobileapps.R;

import java.util.ArrayList;


public class BurgerMenu extends Fragment {



    private View view;
    private RecyclerView recyclerView;
    private ArrayList<FoodItemModel> foodItemModels = new ArrayList<>();





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_burger_menu, container, false);



        recyclerView = view.findViewById(R.id.BurgerRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                "Cheese with chicken","18","12",R.drawable.burger,R.drawable.burger2));

        foodItemModels.add(new FoodItemModel("Classic Burger","Grilled Burger","Beef with lattice",
                "Grilled Chicken","24","14",R.drawable.burger3,R.drawable.burger4));

        foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","French Fries with cheese ",
                "Chicken with Extra maionese","20","15",R.drawable.burger5,R.drawable.burgero));

        //Grilled Chicken Peri Peri - Grilled Chicken Burger Png, Transparent Png
        //Double Grilled Chicken Burger Png

        foodItemModels.add(new FoodItemModel("Burger","Chicken Burger","Onion with lattice",
                "Cheese with chicken extra ","25","30",R.drawable.burger8,R.drawable.burger7));

        foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","French Fries with cheese",
                "Cheese, Chicken, Pickle with extra maionese","22","16",R.drawable.burger9,R.drawable.birger10));

        recyclerView.setAdapter(new RecyclerView_FoodAdapter(foodItemModels,getContext()));




        return view;
    }


}
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


public class SaladsMenu extends Fragment {

   private View view;
   private RecyclerView recyclerView;
    private ArrayList<FoodItemModel> foodItemModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_salads_menu, container, false);

        recyclerView = view.findViewById(R.id.SaladRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        foodItemModels.add(new FoodItemModel("Cobb saladr","Larb","chicken, bacon, avocado, eggs and cheese",
                "Smoke chicken","18","12",R.drawable.salads1,R.drawable.salads2));

        foodItemModels.add(new FoodItemModel("Mexican black bean salad","Waldorf salad","used a a dip, or cooked for tostadas",
                "With extra Cheese","8","12",R.drawable.salads3,R.drawable.salads4));

        foodItemModels.add(new FoodItemModel("Gado-gado","Dressed herring salad","hard-boiled eggs",
                "mayonnaise, boiled eggs","10","15",R.drawable.salads5,R.drawable.salads6));

        foodItemModels.add(new FoodItemModel("Nicoise salad","Tabbouleh","Pickle",
                "Smoked chicken with cherry tomato","12","13",R.drawable.salads7,R.drawable.salads8));

        foodItemModels.add(new FoodItemModel("Fiambre","Israeli salad","Onion with lettuse",
                "chopping up vegetables into tiny pieces","20","20",R.drawable.salads9,R.drawable.salads10));

        recyclerView.setAdapter(new RecyclerView_FoodAdapter(foodItemModels,getContext()));



        return view;
    }
}
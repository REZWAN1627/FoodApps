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


public class PastaMenu extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    private ArrayList<FoodItemModel> foodItemModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_pasta_menu, container, false);
        recyclerView = view.findViewById(R.id.PastaRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        foodItemModels.add(new FoodItemModel("Ravoili Pasta","Pappardelle","With cheese",
                "With Bolognese sauce","28","21",R.drawable.pasta1,R.drawable.pasta2));

        foodItemModels.add(new FoodItemModel("Pasta Alla Norma","Bucatini all’Amatriciana","vegetarians",
                "Guanciale (cheek bacon)","18","20",R.drawable.pasta3,R.drawable.pasta4));

        foodItemModels.add(new FoodItemModel("Pesto alla Genovese"," Ravioli di Ricotta","With basil",
                "cheese, mushroom, meat, cherry tomato","30","30",R.drawable.pasta5,R.drawable.pasta6));

        foodItemModels.add(new FoodItemModel("Ragù Napoletano","Orecchiette ai Cime di Rapa","Paccheri, Strozzapreti a twisted kind of gnocchi",
                "mall, domed, white disks sauce. ","27","20",R.drawable.pasta7,R.drawable.pasta8));

        foodItemModels.add(new FoodItemModel("Lasagna","Spaghetti","beef, pancetta, celery, carrot, onion",
                "Extra Cheese","30","17",R.drawable.pasta9,R.drawable.pasta10));

        recyclerView.setAdapter(new RecyclerView_FoodAdapter(foodItemModels,getContext()));

        return view;
    }
}
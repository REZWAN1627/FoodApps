package com.rex.foodmobileapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.rex.foodmobileapps.Adapter.RecyclerView_FoodAdapter;
import com.rex.foodmobileapps.Model.FoodItemModel;

import java.util.ArrayList;

public class IndividualFoodItem extends AppCompatActivity {
    private static final String TAG = "TAG";

    private TextView IndividualMenuName;
    private String MenuName;
    private RecyclerView recyclerView;


    private ArrayList<FoodItemModel> foodItemModels = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_food_item);

        MenuName = getIntent().getStringExtra("MenuName");

        recyclerView = findViewById(R.id.individualItemRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        IndividualMenuName = findViewById(R.id.IndividualMenuName);

        IndividualMenuName.setText(MenuName+" Menu");

        if (MenuName.equals("Burger")){
            Log.d(TAG, "onCreate: burgeradd called");
            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.burger,R.drawable.burger2));
            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.burger,R.drawable.burger2));
            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.burger,R.drawable.burger2));
            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.burger,R.drawable.burger2));
            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.burger,R.drawable.burger2));
            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.burger,R.drawable.burger2));

            recyclerView.setAdapter(new RecyclerView_FoodAdapter(foodItemModels,this));

        }else if (MenuName.equals("Pasta")){

            Log.d(TAG, "onCreate: pastaaddcalled");

            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.pasta1,R.drawable.pasta2));

            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.pasta3,R.drawable.pasta4));

            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.pasta5,R.drawable.pasta6));

            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.pasta7,R.drawable.pasta8));

            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.pasta9,R.drawable.pasta10));


            recyclerView.setAdapter(new RecyclerView_FoodAdapter(foodItemModels,this));

        }else{

            Log.d(TAG, "onCreate: is called salad");

            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.salads1,R.drawable.salads2));

            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.salads3,R.drawable.salads4));

            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.salads5,R.drawable.salads6));

            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.salads7,R.drawable.salads8));

            foodItemModels.add(new FoodItemModel("Beef Burger","Chicken Burger","Onion with cheese",
                    "Cheese with chicken","18.00","12.00",R.drawable.salads9,R.drawable.salads10));

            recyclerView.setAdapter(new RecyclerView_FoodAdapter(foodItemModels,this));

        }



    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}

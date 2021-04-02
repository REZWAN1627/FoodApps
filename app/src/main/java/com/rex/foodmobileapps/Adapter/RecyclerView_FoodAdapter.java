package com.rex.foodmobileapps.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rex.foodmobileapps.DetailsOfFoodProduct;
import com.rex.foodmobileapps.Model.FoodItemModel;
import com.rex.foodmobileapps.R;

import java.util.ArrayList;

public class RecyclerView_FoodAdapter extends RecyclerView.Adapter<RecyclerView_FoodAdapter.RecyclerView_BurgerViewHolder>  {
    private ArrayList<FoodItemModel> foodItemModels = new ArrayList<>();
    private Context context;

    public RecyclerView_FoodAdapter(ArrayList<FoodItemModel> foodItemModels, Context context) {
        this.foodItemModels = foodItemModels;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView_BurgerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewitem_allfooditems,parent,false);
        return new RecyclerView_BurgerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_BurgerViewHolder holder, int position) {

        holder.ProductName1.setText(foodItemModels.get(position).getFoodName1());
        holder.ProductName2.setText(foodItemModels.get(position).getFoodName2());
        holder.ProductContains1.setText(foodItemModels.get(position).getFoodItemContains1());
        holder.ProductContains2.setText(foodItemModels.get(position).getFoodItemContains2());
        holder.ProductPrice1.setText("$ "+ foodItemModels.get(position).getFoodPrice1()+".00");
        holder.ProductPrice2.setText("$ "+ foodItemModels.get(position).getFoodPrice2()+".00");
        holder.firstImage.setImageResource(foodItemModels.get(position).getFoodImage1());
        holder.SecondImage.setImageResource(foodItemModels.get(position).getFoodImage2());

        holder.AddToCart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,DetailsOfFoodProduct.class);

                i.putExtra("FoodName",foodItemModels.get(position).getFoodName1());
                i.putExtra("Picture",foodItemModels.get(position).getFoodImage1());
                i.putExtra("Contains",foodItemModels.get(position).getFoodItemContains1());
                i.putExtra("Price",foodItemModels.get(position).getFoodPrice1());
                context.startActivity(i);
            }
        });

        holder.AddToCart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,DetailsOfFoodProduct.class);

                i.putExtra("FoodName",foodItemModels.get(position).getFoodName2());
                i.putExtra("Picture",foodItemModels.get(position).getFoodImage2());
                i.putExtra("Contains",foodItemModels.get(position).getFoodItemContains2());
                i.putExtra("Price",foodItemModels.get(position).getFoodPrice2());
                context.startActivity(i);


            }
        });


    }

    @Override
    public int getItemCount() {
        return foodItemModels.size();
    }



    public class RecyclerView_BurgerViewHolder extends RecyclerView.ViewHolder {

        ImageView firstImage, SecondImage;
        TextView ProductName1, ProductName2, ProductContains1, ProductContains2, ProductPrice1, ProductPrice2;
        RelativeLayout AddToCart1, AddToCart2;


        public RecyclerView_BurgerViewHolder(@NonNull View itemView) {
            super(itemView);

            firstImage  = itemView.findViewById(R.id.MenuBurger);
            SecondImage  = itemView.findViewById(R.id.MenuBurger1);
            ProductName1  =itemView.findViewById(R.id.BurgerItemName);
            ProductName2  =itemView.findViewById(R.id.BurgerItemName1);
            ProductContains1 = itemView.findViewById(R.id.BurgerItemContains);
            ProductContains2 = itemView.findViewById(R.id.BurgerItemContains1);
            ProductPrice1 = itemView.findViewById(R.id.BurgerItemPrice);
            ProductPrice2 = itemView.findViewById(R.id.BurgerItemPrice1);

            AddToCart1 = itemView.findViewById(R.id.BurgerItemAddToCart);
            AddToCart2 = itemView.findViewById(R.id.BurgerItemAddToCart1);

        }
    }
}

package com.rex.foodmobileapps.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rex.foodmobileapps.Model.FavouriteModel;
import com.rex.foodmobileapps.Model.FoodItemModel;
import com.rex.foodmobileapps.R;

import java.util.ArrayList;
import java.util.Arrays;

public class RecyclerView_FavouriteAdapter extends RecyclerView.Adapter<RecyclerView_FavouriteAdapter.RecyclerView_FavouriteViewHolder> {

   private ArrayList<FavouriteModel> favouriteModels = new ArrayList<>();
   private Context context;

    public RecyclerView_FavouriteAdapter(ArrayList<FavouriteModel> favouriteModels, Context context) {
        this.favouriteModels = favouriteModels;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView_FavouriteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_favourite,parent,false);
        return new RecyclerView_FavouriteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_FavouriteViewHolder holder, int position) {

        holder.ProductName1.setText(favouriteModels.get(position).getFoodName1());

        holder.ProductContains1.setText(favouriteModels.get(position).getFoodItemContains1());

        holder.ProductPrice1.setText("$ "+ favouriteModels.get(position).getFoodPrice1());

        holder.firstImage.setImageResource(favouriteModels.get(position).getFoodImage1());


    }

    @Override
    public int getItemCount() {
        return favouriteModels.size();
    }

    public class RecyclerView_FavouriteViewHolder extends RecyclerView.ViewHolder {

        ImageView firstImage;
        TextView ProductName1,  ProductContains1, ProductPrice1;

        public RecyclerView_FavouriteViewHolder(@NonNull View itemView) {
            super(itemView);
            firstImage  = itemView.findViewById(R.id.MenuFavourite);

            ProductName1  =itemView.findViewById(R.id.FavouriteItemName);

            ProductContains1 = itemView.findViewById(R.id.FavouriteItemContains);

            ProductPrice1 = itemView.findViewById(R.id.FavouriteItemPrice);


        }
    }
}

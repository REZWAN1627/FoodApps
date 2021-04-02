package com.rex.foodmobileapps.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rex.foodmobileapps.Model.InboxModel;
import com.rex.foodmobileapps.R;

import java.util.ArrayList;

public class RecyclerView_InboxAdapter extends RecyclerView.Adapter<RecyclerView_InboxAdapter.RecyclerView_InboxViewHolder> {
    private Context context;
    private ArrayList<InboxModel> inboxModels = new ArrayList<>();

    public RecyclerView_InboxAdapter(Context context, ArrayList<InboxModel> inboxModels) {
        this.context = context;
        this.inboxModels = inboxModels;
    }

    @NonNull
    @Override
    public RecyclerView_InboxViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewitem_inbox,parent,false);
        return new RecyclerView_InboxViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView_InboxViewHolder holder, int position) {
        holder.FoodName.setText(inboxModels.get(position).getFoodName());
        holder.FoodContains.setText(inboxModels.get(position).getFoodContains());
        holder.FoodPrice.setText(inboxModels.get(position).getPrice());
        holder.OrderedTime.setText(inboxModels.get(position).getTime());
        holder.TotalCost.setText("Total Cost: $ "+inboxModels.get(position).getTotalCost());
        holder.TotalOrdered.setText("Food Item Ordered: "+inboxModels.get(position).getItemOrdered());

    }

    @Override
    public int getItemCount() {
        return inboxModels.size();
    }

    public class RecyclerView_InboxViewHolder extends RecyclerView.ViewHolder {

        TextView FoodName,FoodContains,FoodPrice,OrderedTime,TotalCost,TotalOrdered;

        public RecyclerView_InboxViewHolder(@NonNull View itemView) {
            super(itemView);

            FoodName = itemView.findViewById(R.id.BurgerItemNameInbox);
            FoodContains = itemView.findViewById(R.id.BurgerItemContainsInbox);
            FoodPrice = itemView.findViewById(R.id.BurgerItemPriceInbox);
            OrderedTime = itemView.findViewById(R.id.InboxTime);
            TotalCost = itemView.findViewById(R.id.InboxTotalPrice);
            TotalOrdered = itemView.findViewById(R.id.InboxFoodOrdered);
        }
    }
}

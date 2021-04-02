package com.rex.foodmobileapps.FragmentUI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rex.foodmobileapps.Adapter.RecyclerView_InboxAdapter;
import com.rex.foodmobileapps.Model.InboxModel;
import com.rex.foodmobileapps.R;

import java.util.ArrayList;


public class Inbox extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<InboxModel> inboxModels = new ArrayList<>();




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inbox, container, false);

        recyclerView = view.findViewById(R.id.inboxRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        inboxModels.add(new InboxModel("9.15pm","150","4","Burger","Cheese","$ 18"));
        inboxModels.add(new InboxModel("11.15pm","100","2","Pasta","Extra Cheese","$ 28"));
        inboxModels.add(new InboxModel("9.15am","50","7","Salads","Cherry Tomato","$ 80"));
        inboxModels.add(new InboxModel("2.15pm","105","1","Pasta","Helopino","$ 108"));
        inboxModels.add(new InboxModel("5.15pm","30","3","Salads","Brockly","$ 98"));
        recyclerView.setAdapter(new RecyclerView_InboxAdapter(getContext(),inboxModels));

        return view;
    }
}
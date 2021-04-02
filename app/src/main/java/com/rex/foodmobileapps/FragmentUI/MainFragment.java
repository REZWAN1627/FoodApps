package com.rex.foodmobileapps.FragmentUI;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.rex.foodmobileapps.OnFragmentClickListener;
import com.rex.foodmobileapps.R;


public class MainFragment extends Fragment {
    private OnFragmentClickListener listener;

    private View view;
    private TextView burger,pasta,salads,subheading;
    private static final String TAG = "TAG";



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_main, container, false);

        burger = view.findViewById(R.id.indicator1);
        pasta = view.findViewById(R.id.indicator2);
        salads = view.findViewById(R.id.indicator3);
        subheading = view.findViewById(R.id.mainFragmentText);


        getFragmentManager().beginTransaction().replace(view.findViewById(R.id.cointainerinFragment).getId(),new BurgerMenu()).commit();

        view.findViewById(R.id.BurgerFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burger.setVisibility(View.VISIBLE);
                salads.setVisibility(View.GONE);
                pasta.setVisibility(View.GONE);
                subheading.setText("Better Burger!");
                Log.d(TAG, "onClick: "+view.findViewById(R.id.cointainerinFragment).getId());
                listener.OnBurgerClicked(true,"Burger");

               getFragmentManager().beginTransaction().replace(view.findViewById(R.id.cointainerinFragment).getId(),new BurgerMenu()).commit();
            }
        });
        view.findViewById(R.id.FragmentPasta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                burger.setVisibility(View.GONE);
                pasta.setVisibility(View.VISIBLE);
                salads.setVisibility(View.GONE);
                subheading.setText("Better Pasta!");
                listener.OnBurgerClicked(true,"Pasta");


                getFragmentManager().beginTransaction().replace(view.findViewById(R.id.cointainerinFragment).getId(),new PastaMenu()).commit();

            }
        });

        view.findViewById(R.id.FragmentSalad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salads.setVisibility(View.VISIBLE);
                pasta.setVisibility(View.GONE);
                burger.setVisibility(View.GONE);

                subheading.setText("Better Salads!");

                listener.OnBurgerClicked(true, "Salads");

                getFragmentManager().beginTransaction().replace(view.findViewById(R.id.cointainerinFragment).getId(),new SaladsMenu()).commit();
            }
        });

        view.findViewById(R.id.filter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Under Develop", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentClickListener){
            listener = (OnFragmentClickListener) context;
        }else {
            throw new ClassCastException(context.toString()+"Must Implements Method");
        }
    }
}
package com.rex.foodmobileapps;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.rex.foodmobileapps.FragmentUI.Favourite;
import com.rex.foodmobileapps.FragmentUI.Inbox;
import com.rex.foodmobileapps.FragmentUI.MainFragment;


public class MainActivity extends AppCompatActivity implements OnFragmentClickListener {

    private DrawerLayout drawerLayout;

    private boolean Burger = true, Salads = false, Pasta = false;

    private String MenuName = "Burger";

    private static final String TAG = "TAG";

    private Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        findViewById(R.id.NavigationIcon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new MainFragment()).commit();

    }

    public void SearchQuery(View view) {
        Toast.makeText(this, "Under Develop", Toast.LENGTH_SHORT).show();
    }


    public void Favourite(View view) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
           getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.fragmentContainer,new Favourite()).commit();

        } else {
            getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.fragmentContainer,new Favourite()).commit();
        }
    }

    //
    public void AddMenu(View view) {
        Log.d(TAG, "AddMenu: is clicked Burger " + Burger +
                " Pasta " + Pasta + " Salads " + Salads);


        if (Burger && MenuName.equals("Burger")) {
            Log.d(TAG, "AddMenu: Burger block");
            startActivity(new Intent(MainActivity.this, IndividualFoodItem.class).putExtra("MenuName", "Burger"));


        } else if (Pasta && MenuName.equals("Pasta")) {
            startActivity(new Intent(MainActivity.this, IndividualFoodItem.class).putExtra("MenuName", "Pasta"));


        } else if (Salads && MenuName.equals("Salads")) {
            startActivity(new Intent(MainActivity.this, IndividualFoodItem.class).putExtra("MenuName", "Salads"));

        } else {
            Toast.makeText(this, "haven't Selected", Toast.LENGTH_SHORT).show();
        }

    }

    public void CartList(View view) {
        Toast.makeText(this, "Under Develop", Toast.LENGTH_SHORT).show();
    }

    public void inbox(View view) {
        getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.fragmentContainer, new Inbox()).commit();
    }


    @Override
    public void OnBurgerClicked(boolean State, String menuName) {

        if (menuName.equals("Burger")) {
            Burger = State;
            Pasta = false;
            Salads = false;
            MenuName = menuName;

        } else if (menuName.equals("Pasta")) {

            Pasta = State;
            Burger = false;
            Salads = false;

            MenuName = menuName;
        } else {

            Salads = State;
            Pasta = false;
            Burger = false;
            MenuName = menuName;
        }

    }

    public void Coupons(View view) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(this, "You Don't have any", Toast.LENGTH_SHORT).show();
            return;

        }
    }

    public void Offers(View view) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(this, "You Don't have any", Toast.LENGTH_SHORT).show();
            return;

        }
    }

    public void Settings(View view) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(this, "Under Develop", Toast.LENGTH_SHORT).show();
            return;

        }
    }

    public void About(View view) {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);

            new AlertDialog.Builder(this)
                    .setTitle(" About Apps")
                    .setMessage("Simple Food Apps using fragment\nDeveloper Name: Rezwan Kabir\nId: 171-15-9271\nVersion: 1.0")

                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "Thank You!", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setIcon(R.drawable.about)
                    .show();

        }

    }

    public void Home(View view) {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
            getSupportFragmentManager().popBackStack();

        }

    }
}
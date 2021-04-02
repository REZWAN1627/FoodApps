package com.rex.foodmobileapps;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailsOfFoodProduct extends AppCompatActivity {


    private TextView ProductName, ProductDetails, IncrementNumber, ProductPrice;
    private String FoodName, Contains, Price;
    private int counter = 1, productTotalPrice = 0, Picture;
    private static final String TAG = "TAG";
    private int result = 0;

    private ImageView imageView;

    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_of_food_product);

        imageView = findViewById(R.id.imageView);
        ProductName = findViewById(R.id.selectionProductName);
        ProductDetails = findViewById(R.id.selectionProductContains);
        IncrementNumber = findViewById(R.id.ProductIncrementsValue);
        ProductPrice = findViewById(R.id.totalPriceOfProduct);

        FoodName = getIntent().getStringExtra("FoodName");
        Picture = getIntent().getIntExtra("Picture", 0);
        Contains = getIntent().getStringExtra("Contains");
        Price = getIntent().getStringExtra("Price");


        ProductPrice.setText("TAKA " + Price);
        ProductName.setText(FoodName);
        ProductDetails.setText(Contains);
        imageView.setImageResource(Picture);

        productTotalPrice = Integer.parseInt(Price);



    }

    public void Increments(View view) {
        Log.d(TAG, "Increments: method called");
        counter++;
        IncrementNumber.setText(String.valueOf(counter));
        result = productTotalPrice * counter;
        ProductPrice.setText("TAKA " + String.valueOf(result));

    }

    public void OrderNow(View view) {

        Dialog(FoodName, Contains, Price, result, String.valueOf(counter),Picture);
    }

    public void Decrements(View view) {
        if (counter <= 0) {
            Toast.makeText(this, "Invalid", Toast.LENGTH_SHORT).show();
            return;
        } else {
            counter--;
            IncrementNumber.setText(String.valueOf(counter));
            result = productTotalPrice * counter;
            ProductPrice.setText("TAKA " + String.valueOf(result));

        }

    }

    private void Dialog(String productName, String productDetails, String productCost, int productTotalCost, String orderedItem, int Image) {


        dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_purchased_food);
        TextView ProductName, ProductDetails, ProductPurchasedTime, ItemOrderedNumber, ProductTotalCost, ProductCost;


        ImageView imageView = dialog.findViewById(R.id.MenuBurgerDialog);
        ProductName = dialog.findViewById(R.id.BurgerItemNameDialog);
        ProductDetails = dialog.findViewById(R.id.BurgerItemContainsDialog);
        ProductCost = dialog.findViewById(R.id.BurgerItemPriceDialog);
        ProductPurchasedTime = dialog.findViewById(R.id.DialogTime);
        ProductTotalCost = dialog.findViewById(R.id.DialogTotalPrice);
        ItemOrderedNumber = dialog.findViewById(R.id.DialogFoodOrdered);


        int totalCost = productTotalCost;

        if (productTotalCost == 0) {
            totalCost = Integer.parseInt(Price);
        }

        dialog.findViewById(R.id.dialogback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        imageView.setImageResource(Image);
        ProductName.setText(productName);
        ProductCost.setText("$ " + productCost + ".00");
        ProductDetails.setText(productDetails);
        ProductTotalCost.setText("Total $ " + String.valueOf(totalCost) + ".00");
        ItemOrderedNumber.setText("Item Ordered " + orderedItem);
        ProductPurchasedTime.setText("Time: " + new SimpleDateFormat("hh:mm a").format(new Date()));

        dialog.findViewById(R.id.dialogThankyou).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetailsOfFoodProduct.this, "Purchased!", Toast.LENGTH_SHORT).show();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        dialog.dismiss();

                    }
                }, 2000);
            }
        });
        dialog.show();


    }

    public void detailsPage(View view) {
        super.onBackPressed();
    }
}
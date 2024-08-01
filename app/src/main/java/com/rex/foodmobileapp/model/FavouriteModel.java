package com.rex.foodmobileapp.model;

public class FavouriteModel {

    private String FoodName1;

    private String FoodItemContains1;

    private String FoodPrice1;

    private int FoodImage1;

    public String getFoodName1() {
        return FoodName1;
    }

    public String getFoodItemContains1() {
        return FoodItemContains1;
    }

    public String getFoodPrice1() {
        return FoodPrice1;
    }

    public int getFoodImage1() {
        return FoodImage1;
    }

    public FavouriteModel(String foodName1, String foodItemContains1, String foodPrice1, int foodImage1) {
        FoodName1 = foodName1;
        FoodItemContains1 = foodItemContains1;
        FoodPrice1 = foodPrice1;
        FoodImage1 = foodImage1;
    }

    public void setFoodName1(String foodName1) {
        FoodName1 = foodName1;
    }

    public void setFoodItemContains1(String foodItemContains1) {
        FoodItemContains1 = foodItemContains1;
    }

    public void setFoodPrice1(String foodPrice1) {
        FoodPrice1 = foodPrice1;
    }

    public void setFoodImage1(int foodImage1) {
        FoodImage1 = foodImage1;
    }
}

package com.rex.foodmobileapps.Model;

public class FoodItemModel {

    private String FoodName1;
    private String FoodName2;
    private String FoodItemContains1;
    private String FoodItemContains2;
    private String FoodPrice1;
    private String FoodPrice2;
    private int FoodImage1;
    private int FoodImage2;

    public FoodItemModel(String foodName1,
                         String foodName2, String foodItemContains1, String foodItemContains2,
                         String foodPrice1, String foodPrice2, int foodImage1,
                         int foodImage2) {
        FoodName1 = foodName1;
        FoodName2 = foodName2;
        FoodItemContains1 = foodItemContains1;
        FoodItemContains2 = foodItemContains2;
        FoodPrice1 = foodPrice1;
        FoodPrice2 = foodPrice2;
        FoodImage1 = foodImage1;
        FoodImage2 = foodImage2;
    }

    public String getFoodName1() {
        return FoodName1;
    }

    public String getFoodName2() {
        return FoodName2;
    }

    public String getFoodItemContains1() {
        return FoodItemContains1;
    }

    public String getFoodItemContains2() {
        return FoodItemContains2;
    }

    public String getFoodPrice1() {
        return FoodPrice1;
    }

    public String getFoodPrice2() {
        return FoodPrice2;
    }

    public int getFoodImage1() {
        return FoodImage1;
    }

    public int getFoodImage2() {
        return FoodImage2;
    }
}


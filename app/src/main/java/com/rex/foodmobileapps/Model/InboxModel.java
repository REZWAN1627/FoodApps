package com.rex.foodmobileapps.Model;

public class InboxModel {
    private String Time;
    private String TotalCost;
    private String ItemOrdered;
    private String FoodName;
    private String FoodContains;
    private String Price;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(String totalCost) {
        TotalCost = totalCost;
    }

    public String getItemOrdered() {
        return ItemOrdered;
    }

    public void setItemOrdered(String itemOrdered) {
        ItemOrdered = itemOrdered;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String foodName) {
        FoodName = foodName;
    }

    public String getFoodContains() {
        return FoodContains;
    }

    public void setFoodContains(String foodContains) {
        FoodContains = foodContains;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public InboxModel(String time, String totalCost, String itemOrdered, String foodName, String foodContains, String price) {
        Time = time;
        TotalCost = totalCost;
        ItemOrdered = itemOrdered;
        FoodName = foodName;
        FoodContains = foodContains;
        Price = price;
    }
}

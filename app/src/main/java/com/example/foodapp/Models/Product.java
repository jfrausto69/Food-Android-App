package com.example.foodapp.Models;

public abstract class Product {
    public String image;
    public String name;
    public String description;
    public double price;
    public int restaurantId;
    public abstract int getId();
    public String getName() {
        return name;
    };
    public String getDescription(){
        return description;
    };
    public double getPrice(){
        return price;
    };
    public  String getImage() {
        return image;
    };
    public int getRestaurantId(){
        return restaurantId;
    };
}

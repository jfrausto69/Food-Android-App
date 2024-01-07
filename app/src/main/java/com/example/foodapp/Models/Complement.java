package com.example.foodapp.Models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "complements")
public class Complement extends Product {
    @PrimaryKey(autoGenerate = true)
    public int complementId;

    public Complement(String name, String image, String description, double price,int restaurantId) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;
        this.restaurantId = restaurantId;
    }

    @Override
    public int getId() {
        return complementId;
    }
}

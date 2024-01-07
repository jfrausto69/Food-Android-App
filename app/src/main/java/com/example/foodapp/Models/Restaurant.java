package com.example.foodapp.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "restaurants")
public class Restaurant {
    @PrimaryKey(autoGenerate = true)
    public int restaurantId;
    @ColumnInfo(name = "name")
    public String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getRestaurantId() {
        return restaurantId;
    }

}

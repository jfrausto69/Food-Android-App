package com.example.foodapp.DataAccess.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.example.foodapp.Models.Restaurant;
import java.util.List;

@Dao
public interface RestaurantDAO {
    @Transaction
    @Query("SELECT * FROM restaurants")
    List<Restaurant> getAll();

    @Transaction
    @Query("SELECT * FROM restaurants WHERE restaurantId = :id")
    Restaurant getById(int id);

    @Transaction
    @Insert
    void insert(Restaurant[] restaurant);

    @Query("SELECT * FROM restaurants")
    LiveData<List<Restaurant>> getAllRestaurantsLiveData();
}

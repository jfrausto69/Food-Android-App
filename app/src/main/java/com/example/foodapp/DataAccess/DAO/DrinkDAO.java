package com.example.foodapp.DataAccess.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.example.foodapp.Models.Drink;

import java.util.List;

@Dao
public interface DrinkDAO {

    @Transaction
    @Query("SELECT * FROM drinks")
    List<Drink> getAll();

    @Transaction
    @Query("SELECT * FROM drinks WHERE drinkId = :id")
    Drink getById(int id);

    @Transaction
    @Query("SELECT drinks.drinkId, drinks.name,drinks.description,drinks.image,drinks.price,drinks.restaurantId FROM drinks " +
            "INNER JOIN restaurants ON drinks.restaurantId = restaurants.restaurantId " +
            "WHERE restaurants.restaurantId = :restaurantId")
    public List<Drink> getRestaurantDrinks(int restaurantId);

    @Insert
    void insert(Drink[] drinks);
}

package com.example.foodapp.DataAccess.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.example.foodapp.Models.Food;

import java.util.List;
@Dao
public interface FoodDAO {

    @Transaction
    @Query("SELECT * FROM foods")
    List<Food> getAll();

    @Transaction
    @Query("SELECT * FROM foods WHERE foodId = :id")
    Food getById(int id);

    @Transaction
    @Query("SELECT foods.foodId, foods.name,foods.description,foods.image,foods.price,foods.restaurantId FROM foods " +
            "INNER JOIN restaurants ON foods.restaurantId = restaurants.restaurantId " +
            "WHERE restaurants.restaurantId = :restaurantId")
    public List<Food> getFood(int restaurantId);

    @Transaction
    @Insert
    void insert(Food[] food);
}

package com.example.foodapp.DataAccess.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.example.foodapp.Models.Complement;

import java.util.List;

@Dao
public interface ComplementDAO {

    @Transaction
    @Query("SELECT * FROM complements")
    List<Complement> getAll();

    @Transaction
    @Query("SELECT * FROM complements WHERE complementId = :id")
    Complement getById(int id);

    @Transaction
    @Query("SELECT complements.complementId, complements.name,complements.description,complements.image,complements.price,complements.restaurantId FROM complements " +
            "INNER JOIN restaurants ON complements.restaurantId = restaurants.restaurantId " +
            "WHERE restaurants.restaurantId = :restaurantId")
    public List<Complement> getRestaurantComplements(int restaurantId);

    @Insert
    void insert(Complement[] complements);
}

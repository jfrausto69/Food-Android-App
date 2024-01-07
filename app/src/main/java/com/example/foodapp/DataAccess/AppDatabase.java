package com.example.foodapp.DataAccess;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.example.foodapp.DataAccess.DAO.ComplementDAO;
import com.example.foodapp.DataAccess.DAO.DrinkDAO;
import com.example.foodapp.DataAccess.DAO.FoodDAO;
import com.example.foodapp.DataAccess.DAO.RestaurantDAO;
import com.example.foodapp.Models.Complement;
import com.example.foodapp.Models.Drink;
import com.example.foodapp.Models.Food;
import com.example.foodapp.Models.Restaurant;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Executors;

@Database(entities = {Restaurant.class, Drink.class, Complement.class, Food.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static final String TAG = "DBHandler";
    public abstract RestaurantDAO restaurantDao();
    public abstract FoodDAO foodDao();
    public abstract DrinkDAO drinkDao();
    public abstract ComplementDAO complementDAO();
    private static AppDatabase instance;
    private static final Object lock = new Object();

    public static AppDatabase getInstance(final Context context){
        if(instance == null){
            synchronized (lock){
            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "FoodAppDb")
                    .allowMainThreadQueries()
                    .addCallback(new Callback() {
                        @Override
                        public void onCreate(@NonNull @NotNull SupportSQLiteDatabase db) {
                            super.onCreate(db);

                            Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                                @Override
                                public void run() {
                                    Log.i(TAG, "Populando base de datos");
                                    Log.i(TAG,"Insertando restaurantes");
                                    getInstance(context).restaurantDao().insert(Data.restaurants);
                                    Log.i(TAG,"Restaurantes insertados");
                                    Log.i(TAG,"Insertando comidas");
                                    getInstance(context).foodDao().insert(Data.foods);
                                    Log.i(TAG,"Comidas insertadas");
                                    Log.i(TAG,"Insertando bebidas");
                                    getInstance(context).drinkDao().insert(Data.drinks);
                                    Log.i(TAG,"Bebidas insertadas");
                                    Log.i(TAG,"Insertando complementos");
                                    getInstance(context).complementDAO().insert(Data.complements);
                                    Log.i(TAG,"Complementos insertados");
                                    Log.i(TAG,"Base de datos poblada");
                                }
                            });

                        }
                    })
                    .build();
        }
        }
        return instance;
    }
}

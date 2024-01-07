package com.example.foodapp;

import android.annotation.SuppressLint;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodapp.Adapters.RestaurantAdapter;
import com.example.foodapp.DataAccess.AppDatabase;
import com.example.foodapp.Models.Complement;
import com.example.foodapp.Models.Drink;
import com.example.foodapp.Models.Food;
import com.example.foodapp.Models.Restaurant;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RestaurantAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.home_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Restaurant");
        recyclerView = findViewById(R.id.restaurantRecyclerView);
        try{
            AppDatabase db = AppDatabase.getInstance(this);
            db.restaurantDao().getAllRestaurantsLiveData().observe(this, new Observer<List<Restaurant>>() {
                @Override
                public void onChanged(List<Restaurant> restaurants) {
                    adapter = new RestaurantAdapter(restaurants);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
                    recyclerView.setLayoutManager(layoutManager);
                    recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
                    recyclerView.setAdapter(adapter);
                }
            });
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
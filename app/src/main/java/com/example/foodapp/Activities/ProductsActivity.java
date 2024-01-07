package com.example.foodapp.Activities;

import android.util.Log;
import android.widget.ListView;
import android.widget.TableLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.example.foodapp.Adapters.ProductAdapter;
import com.example.foodapp.Adapters.ViewPagerAdapter;
import com.example.foodapp.DataAccess.AppDatabase;
import com.example.foodapp.Models.Food;
import com.example.foodapp.Models.Restaurant;
import com.example.foodapp.R;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class ProductsActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPagerAdapter viewPagerAdapter;
    ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        int restaurantId = getIntent().getIntExtra("restaurantId", 0);
        Restaurant restaurant = AppDatabase.getInstance(this).restaurantDao().getById(restaurantId);
        getSupportActionBar().setTitle(restaurant.getName());


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab){
                viewPager.setCurrentItem(tab.getPosition());
                Log.d("tab", String.valueOf(tab.getPosition()));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab){
                Log.d("tab", String.valueOf(tab.getPosition()));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab){
                Log.d("tab", String.valueOf(tab.getPosition()));
            }
        });

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position){
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });
    }
}
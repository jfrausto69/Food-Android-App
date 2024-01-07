package com.example.foodapp.Activities;

import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.example.foodapp.DataAccess.AppDatabase;
import com.example.foodapp.Models.Complement;
import com.example.foodapp.Models.Drink;
import com.example.foodapp.Models.Food;
import com.example.foodapp.Models.Product;
import com.example.foodapp.R;
import com.squareup.picasso.Picasso;

public class FoodDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        TextView productName = findViewById(R.id.productName);
        TextView productDescription = findViewById(R.id.productDescription);
        TextView productPrice = findViewById(R.id.productPrice);
        ImageView productImage = findViewById(R.id.productImage);
        Toolbar toolbar = findViewById(R.id.toolbar_food_detail);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true); // Habilita el botón de retroceso
        }

        String productType = getIntent().getStringExtra("productType");
        int productId = getIntent().getIntExtra("productId", 0);

        productName.setText(String.valueOf(productId));
        AppDatabase db = AppDatabase.getInstance(this);
        Product product = null;
        switch(productType){
            case "Food":
                product = db.foodDao().getById(productId);
                break;
            case "Drink":
                product = db.drinkDao().getById(productId);
                break;
            case "Complement":
                product = db.complementDAO().getById(productId);
                break;
        }
        if(product != null){
            productName.setText(product.getName());
            productDescription.setText(product.getDescription());
            String price = "$"+String.format("%.2f", product.getPrice());
            productPrice.setText(price);
            Picasso.get().load(product.getImage()).into(productImage);
        }
        else{
            Log.i("PRODUCT", "PRODUCT IS NULL");
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed(); // Simula la acción de retroceso
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
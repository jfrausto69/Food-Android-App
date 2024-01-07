package com.example.foodapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodapp.Activities.FoodDetailActivity;
import com.example.foodapp.Models.Complement;
import com.example.foodapp.Models.Drink;
import com.example.foodapp.Models.Food;
import com.example.foodapp.R;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter<Product> extends RecyclerView.Adapter<ProductAdapter.ViewHolder> implements Filterable {
    private List<Product> productsList;
    private List<Product> productListfull;

    @Override
    public Filter getFilter() {
        return filter;
    }

    private Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Product> filteredProducts = new ArrayList<>();
            if(constraint == null || constraint.length() == 0) {
                filteredProducts.addAll(productListfull);
            }
            else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for(Product product : productListfull){
                    switch(product.getClass().getSimpleName()){
                        case "Food":
                            Food food = (Food) product;
                            if(food.getName().toLowerCase().contains(filterPattern)){
                                filteredProducts.add(product);
                            }
                            break;
                        case "Drink":
                            Drink drink = (Drink) product;
                            if(drink.getName().toLowerCase().contains(filterPattern)){
                                filteredProducts.add(product);
                            }
                            break;
                        case "Complement":
                            Complement complement = (Complement) product;
                            if(complement.getName().toLowerCase().contains(filterPattern)){
                                filteredProducts.add(product);
                            }
                            break;
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredProducts;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            productsList.clear();
            productsList.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView productName;
        private final TextView productPrice;
        public ViewHolder(@NonNull @NotNull View view) {
            super(view);
            productName = view.findViewById(R.id.product_name);
            productPrice = view.findViewById(R.id.product_price);
        }

        public TextView getProductName() {
            return productName;
        }

        public TextView getProductPrice() {
            return productPrice;
        }
    }

    public ProductAdapter(List<Product> productsList) {
        this.productsList = productsList;
        productListfull = new ArrayList<>(productsList);
    }
    @NonNull
    @NotNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list_item, parent, false);
        return new ProductAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ProductAdapter.ViewHolder holder, int position) {
        Product product = productsList.get(position);
        int productId = 0;
        switch(product.getClass().getSimpleName()){
            case "Food":
                Food food = (Food) product;
                holder.productName.setText(food.getName());
                String price = "$"+String.format("%.2f", food.getPrice());
                holder.productPrice.setText(price);
                productId = food.getId();
                break;
            case "Drink":
                Drink drink = (Drink) product;
                holder.productName.setText(drink.getName());
                String priceDrink = "$"+String.format("%.2f", drink.getPrice());
                holder.productPrice.setText(priceDrink);
                productId = drink.getId();
                break;
            case "Complement":
                Complement complement = (Complement) product;
                holder.productName.setText(complement.getName());
                String priceComplement = "$"+String.format("%.2f", complement.getPrice());
                holder.productPrice.setText(priceComplement);
                productId = complement.getId();
                break;
        }

        int finalProductId = productId;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FoodDetailActivity.class);
                intent.putExtra("productId", finalProductId);
                intent.putExtra("productType", product.getClass().getSimpleName());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }
}

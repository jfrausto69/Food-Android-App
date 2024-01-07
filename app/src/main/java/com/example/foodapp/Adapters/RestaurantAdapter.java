package com.example.foodapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodapp.Models.Restaurant;
import com.example.foodapp.R;
import org.jetbrains.annotations.NotNull;

import java.sql.ResultSet;
import java.util.List;

import static java.security.AccessController.getContext;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    private final List<Restaurant> restaurantList;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView restaurantName;
        public ViewHolder(@NonNull @NotNull View view) {
            super(view);
            restaurantName = view.findViewById(R.id.name);
        }
    }


    public RestaurantAdapter(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        holder.restaurantName.setText(restaurantList.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int restaurantId = restaurantList.get(position).getRestaurantId();
                Log.i("RestaurantId", String.valueOf(restaurantId));

                Intent intent = new Intent(view.getContext(), com.example.foodapp.Activities.ProductsActivity.class);
                intent.putExtra("restaurantId", restaurantId);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

}

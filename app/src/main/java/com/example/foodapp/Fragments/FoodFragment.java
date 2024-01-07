package com.example.foodapp.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.foodapp.Adapters.ProductAdapter;
import com.example.foodapp.DataAccess.AppDatabase;
import com.example.foodapp.Models.Food;
import com.example.foodapp.R;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    private int restaurantId;
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        Log.i("FRAGMENT OnCreate", String.valueOf(restaurantId));
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_food, container, false);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull @NotNull Menu menu, @NonNull @NotNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setQueryHint("Buscar comida");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query){
                productAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText){
                productAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        restaurantId = getActivity().getIntent().getIntExtra("restaurantId", 0);
        List<Food> foodList = AppDatabase.getInstance(getContext()).foodDao().getFood(restaurantId);
        productAdapter = new ProductAdapter<Food>(foodList);

        if(view != null){
            recyclerView = view.findViewById(R.id.productsRecyclerView);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(productAdapter);
            recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        }
    }
}
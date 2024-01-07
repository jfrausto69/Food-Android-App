package com.example.foodapp.Fragments;

import android.os.Bundle;
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
import com.example.foodapp.Models.Drink;
import com.example.foodapp.Models.Food;
import com.example.foodapp.R;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DrinkFragment extends Fragment {
    private int restaurantId;
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    public DrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_drink, container, false);
    }

    @Override
    public void onCreateOptionsMenu(@NonNull @NotNull Menu menu, @NonNull @NotNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setQueryHint("Buscar bebidas");
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
        List<Drink> drinkList = AppDatabase.getInstance(getContext()).drinkDao().getRestaurantDrinks(restaurantId);
        productAdapter = new ProductAdapter<Drink>(drinkList);

        if(view != null){
            recyclerView = view.findViewById(R.id.drinksRecyclerView);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(productAdapter);
            recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        }
    }
}
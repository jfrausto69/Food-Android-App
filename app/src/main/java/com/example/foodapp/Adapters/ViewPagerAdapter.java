package com.example.foodapp.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.foodapp.Fragments.ComplementFragment;
import com.example.foodapp.Fragments.DrinkFragment;
import com.example.foodapp.Fragments.FoodFragment;
import org.jetbrains.annotations.NotNull;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull @NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FoodFragment();

                case 1:
                return new DrinkFragment();

                case 2:
                return new ComplementFragment();

            default:
                return new FoodFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

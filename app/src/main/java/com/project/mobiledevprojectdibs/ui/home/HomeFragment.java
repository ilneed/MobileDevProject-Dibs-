package com.project.mobiledevprojectdibs.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.project.mobiledevprojectdibs.ClothesCategory;
import com.project.mobiledevprojectdibs.FoodCategoryy;
import com.project.mobiledevprojectdibs.R;
import com.project.mobiledevprojectdibs.ServicesCategory;

public class HomeFragment extends Fragment {


    TableRow clothesTable, foodTable, servicesTable;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        //final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);

            }
        });
        clothesTable = root.findViewById(R.id.clothingCategory);

        clothesTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClothesCategory clothesCategory = new ClothesCategory();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.homeFragment,clothesCategory);
                transaction.commit();
            }
        });
        foodTable = root.findViewById(R.id.foodCategory);

        foodTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FoodCategoryy foodCategoryy = new FoodCategoryy();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.homeFragment,foodCategoryy);
                transaction.commit();
            }
        });
        servicesTable = root.findViewById(R.id.servicesCategory);

        servicesTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServicesCategory servicesCategory = new ServicesCategory();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.homeFragment,servicesCategory);
                transaction.commit();
            }
        });




        return root;
    }
}
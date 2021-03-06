package com.project.mobiledevprojectdibs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.project.mobiledevprojectdibs.ui.home.HomeFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FoodCategoryy#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodCategoryy extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FoodCategoryy() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FoodCategoryy.
     */
    // TODO: Rename and change types and number of parameters
    public static FoodCategoryy newInstance(String param1, String param2) {
        FoodCategoryy fragment = new FoodCategoryy();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    LinearLayout productOneFood,productTwoFood,productThreeFood,productFourFood,productFiveFood,productSixFood;
    ImageButton backButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_food_categoryy, container, false);

        productOneFood = root.findViewById(R.id.firstProductFood);
        productOneFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FriedChicken friedChicken = new FriedChicken();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.foodCategoryy,friedChicken);
                transaction.commit();
            }
        });

        productTwoFood = root.findViewById(R.id.secondProductFood);
        productTwoFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Milktea milktea = new Milktea();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.foodCategoryy,milktea);
                transaction.commit();
            }
        });
        productThreeFood = root.findViewById(R.id.thirdProductFood);
        productThreeFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spaghetti spaghetti = new Spaghetti();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.foodCategoryy,spaghetti);
                transaction.commit();
            }
        });
        productFourFood = root.findViewById(R.id.fourthProductFood);
        productFourFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChickenBurger chickenBurger = new ChickenBurger();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.foodCategoryy,chickenBurger);
                transaction.commit();
            }
        });
        productFiveFood = root.findViewById(R.id.fifthProductFood);
        productFiveFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomemadePizza homemadePizza = new HomemadePizza();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.foodCategoryy,homemadePizza);
                transaction.commit();
            }
        });
        productSixFood = root.findViewById(R.id.sixthProductFood);
        productSixFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaliforniaMaki californiaMaki = new CaliforniaMaki();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.foodCategoryy,californiaMaki);
                transaction.commit();
            }
        });


        backButton = root.findViewById(R.id.backButtonFC);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment homeFragment = new HomeFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.foodCategoryy,homeFragment);
                transaction.commit();
            }
        });




        return root;
    }
}
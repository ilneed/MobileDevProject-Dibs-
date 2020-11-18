package com.project.mobiledevprojectdibs;

import android.os.Bundle;

import androidx.annotation.NonNull;
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
 * Use the {@link ClothesCategory#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ClothesCategory extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ClothesCategory() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ClothesCategory.
     */
    // TODO: Rename and change types and number of parameters
    public static ClothesCategory newInstance(String param1, String param2) {
        ClothesCategory fragment = new ClothesCategory();
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


    LinearLayout productOne, productTwo, productThree, productFour, productFive, productSix;
    ImageButton backButton;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_clothes_category, container, false);

        productOne = root.findViewById(R.id.firstProduct);
        productOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DmsxShoes dmsxShoes = new DmsxShoes();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.clothesCategory,dmsxShoes);
                transaction.commit();
            }
        });
        productTwo = root.findViewById(R.id.secondProduct);
        productTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenShorts menShorts = new MenShorts();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.clothesCategory,menShorts);
                transaction.commit();
            }
        });
        productThree = root.findViewById(R.id.thirdProduct);
        productThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenTshirt menTshirt = new MenTshirt();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.clothesCategory,menTshirt);
                transaction.commit();
            }
        });
        productFour = root.findViewById(R.id.fourthProduct);
        productFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SillyShirt sillyShirt = new SillyShirt();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.clothesCategory,sillyShirt);
                transaction.commit();
            }
        });
        productFive = root.findViewById(R.id.fifthProduct);
        productFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenTankTop menTankTop = new MenTankTop();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.clothesCategory,menTankTop);
                transaction.commit();
            }
        });
        productSix = root.findViewById(R.id.sixthProduct);
        productSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenPants menPants = new MenPants();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.clothesCategory,menPants);
                transaction.commit();
            }
        });

        backButton = root.findViewById(R.id.backButtonCC);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment homeFragment = new HomeFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.clothesCategory,homeFragment);
                transaction.commit();
            }
        });

        return root;
    }
}
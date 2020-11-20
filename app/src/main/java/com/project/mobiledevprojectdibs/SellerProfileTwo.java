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
 * Use the {@link SellerProfileTwo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SellerProfileTwo extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SellerProfileTwo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SellerProfileTwo.
     */
    // TODO: Rename and change types and number of parameters
    public static SellerProfileTwo newInstance(String param1, String param2) {
        SellerProfileTwo fragment = new SellerProfileTwo();
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
    ImageButton closeButton;
    LinearLayout prod1, prod2, prod3, prod4, prod5, prod6;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_seller_profile_two, container, false);
        closeButton = root.findViewById(R.id.backButtonSP);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment homeFragment = new HomeFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileTwo,homeFragment);
                transaction.commit();
            }
        });

        prod1 = root.findViewById(R.id.seller2prod1);
        prod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spaghetti spaghetti = new Spaghetti();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileTwo,spaghetti);
                transaction.commit();
            }
        });
        prod2 = root.findViewById(R.id.seller2prod2);
        prod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChickenBurger chickenBurger = new ChickenBurger();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileTwo,chickenBurger);
                transaction.commit();
            }
        });
        prod3 = root.findViewById(R.id.seller2prod3);
        prod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenTshirt menTshirt = new MenTshirt();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileTwo,menTshirt);
                transaction.commit();
            }
        });
        prod4 = root.findViewById(R.id.seller2prod4);
        prod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SillyShirt sillyShirt = new SillyShirt();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileTwo,sillyShirt);
                transaction.commit();
            }
        });
        prod5 = root.findViewById(R.id.seller2prod5);
        prod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AmantePlumbingServices amantePlumbingServices = new AmantePlumbingServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileTwo,amantePlumbingServices);
                transaction.commit();
            }
        });
        prod6 = root.findViewById(R.id.seller2prod6);
        prod6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AromaCateringServices aromaCateringServices = new AromaCateringServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileTwo,aromaCateringServices);
                transaction.commit();
            }
        });
        return root;
    }
}
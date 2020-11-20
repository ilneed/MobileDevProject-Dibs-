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
 * Use the {@link SellerProfileThree#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SellerProfileThree extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SellerProfileThree() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SellerProfileThree.
     */
    // TODO: Rename and change types and number of parameters
    public static SellerProfileThree newInstance(String param1, String param2) {
        SellerProfileThree fragment = new SellerProfileThree();
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
        View root =  inflater.inflate(R.layout.fragment_seller_profile_three, container, false);
        closeButton = root.findViewById(R.id.backButtonSP);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment homeFragment = new HomeFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileThree,homeFragment);
                transaction.commit();
            }
        });
        prod1 = root.findViewById(R.id.seller3prod1);
        prod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomemadePizza homemadePizza = new HomemadePizza();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileThree,homemadePizza);
                transaction.commit();
            }
        });
        prod2 = root.findViewById(R.id.seller3prod2);
        prod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CaliforniaMaki californiaMaki = new CaliforniaMaki();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileThree,californiaMaki);
                transaction.commit();
            }
        });
        prod3 = root.findViewById(R.id.seller3prod3);
        prod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenTankTop menTankTop = new MenTankTop();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileThree,menTankTop);
                transaction.commit();
            }
        });
        prod4 = root.findViewById(R.id.seller3prod4);
        prod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenPants menPants = new MenPants();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileThree,menPants);
                transaction.commit();
            }
        });
        prod5 = root.findViewById(R.id.seller3prod5);
        prod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeMassageServices homeMassageServices = new HomeMassageServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileThree,homeMassageServices);
                transaction.commit();
            }
        });
        prod6 = root.findViewById(R.id.seller3prod6);
        prod6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EcoCleanServices ecoCleanServices = new EcoCleanServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfileThree,ecoCleanServices);
                transaction.commit();
            }
        });
        return root;
    }
}
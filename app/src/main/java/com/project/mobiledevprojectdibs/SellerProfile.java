package com.project.mobiledevprojectdibs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.project.mobiledevprojectdibs.ui.home.HomeFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SellerProfile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SellerProfile extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SellerProfile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SellerProfile.
     */
    // TODO: Rename and change types and number of parameters
    public static SellerProfile newInstance(String param1, String param2) {
        SellerProfile fragment = new SellerProfile();
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
        View root =  inflater.inflate(R.layout.fragment_seller_profile, container, false);
        closeButton = root.findViewById(R.id.backButtonSP);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment homeFragment = new HomeFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfile,homeFragment);
                transaction.commit();
            }
        });

        prod1  = root.findViewById(R.id.seller1prod1);
        prod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FriedChicken friedChicken = new FriedChicken();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfile,friedChicken);
                transaction.commit();
            }
        });
        prod2  = root.findViewById(R.id.seller1prod2);
        prod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Milktea milktea = new Milktea();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfile,milktea);
                transaction.commit();
            }
        });
        prod3  = root.findViewById(R.id.seller1prod3);
        prod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DmsxShoes dmsxShoes = new DmsxShoes();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfile,dmsxShoes);
                transaction.commit();
            }
        });
        prod4  = root.findViewById(R.id.seller1prod4);
        prod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenShorts menShorts = new MenShorts();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfile,menShorts);
                transaction.commit();
            }
        });
        prod5  = root.findViewById(R.id.seller1prod5);
        prod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TeamQualityServices teamQualityServices = new TeamQualityServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfile,teamQualityServices);
                transaction.commit();
            }
        });
        prod6  = root.findViewById(R.id.seller1prod6);
        prod6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlumbingServices plumbingServices = new PlumbingServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfile,plumbingServices);
                transaction.commit();
            }
        });

        return root;
    }
}
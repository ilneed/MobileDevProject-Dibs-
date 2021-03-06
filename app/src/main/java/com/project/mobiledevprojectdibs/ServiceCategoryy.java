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
 * Use the {@link ServiceCategoryy#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ServiceCategoryy extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ServiceCategoryy() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ServiceCategoryy.
     */
    // TODO: Rename and change types and number of parameters
    public static ServiceCategoryy newInstance(String param1, String param2) {
        ServiceCategoryy fragment = new ServiceCategoryy();
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
    ImageButton backButton;
    LinearLayout productOne, productTwo, productThree, productFour, productFive, productSix;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_service_categoryy, container, false);
        productOne = root.findViewById(R.id.productOneServices);
        productOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TeamQualityServices teamQualityServices = new TeamQualityServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.serviceCategoryy,teamQualityServices);
                transaction.commit();
            }
        });
        productTwo = root.findViewById(R.id.productTwoServices);
        productTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlumbingServices plumbingServices = new PlumbingServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.serviceCategoryy,plumbingServices);
                transaction.commit();
            }
        });
        productThree = root.findViewById(R.id.productThreeServices);
        productThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AmantePlumbingServices amantePlumbingServices = new AmantePlumbingServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.serviceCategoryy,amantePlumbingServices);
                transaction.commit();
            }
        });
        productFour = root.findViewById(R.id.productFourServices);
        productFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AromaCateringServices aromaCateringServices = new AromaCateringServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.serviceCategoryy,aromaCateringServices);
                transaction.commit();
            }
        });
        productFive = root.findViewById(R.id.productFiveServices);
        productFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeMassageServices homeMassageServices = new HomeMassageServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.serviceCategoryy,homeMassageServices);
                transaction.commit();
            }
        });
        productSix = root.findViewById(R.id.productSixServices);
        productSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EcoCleanServices ecoCleanServices = new EcoCleanServices();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.serviceCategoryy,ecoCleanServices);
                transaction.commit();
            }
        });

        backButton = root.findViewById(R.id.backButtonSC);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment homeFragment = new HomeFragment();
                FragmentTransaction transaction  = getFragmentManager().beginTransaction();
                transaction.replace(R.id.serviceCategoryy, homeFragment);
                transaction.commit();
            }
        });

        return root;
    }
}